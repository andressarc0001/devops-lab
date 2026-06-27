terraform {
  required_providers {
    docker = {
      source  = "kreuzwerker/docker"
      version = "~> 3.0"
    }
  }
}

provider "docker" {}

# Rede
resource "docker_network" "devops_net" {
  name = "terraform-devops-net"
}

# Volume persistente do MinIO
resource "docker_volume" "minio_data" {
  name = "terraform-minio-data"
}

# MinIO
resource "docker_container" "minio" {
  name  = "terraform-minio"
  image = "minio/minio:latest"

  ports {
    internal = 9000
    external = 9002
  }

  ports {
    internal = 9001
    external = 9003
  }

  env = [
    "MINIO_ROOT_USER=minioadmin",
    "MINIO_ROOT_PASSWORD=minioadmin123"
  ]

  command = ["server", "/data", "--console-address", ":9001"]

  volumes {
    volume_name    = docker_volume.minio_data.name
    container_path = "/data"
  }

  networks_advanced {
    name = docker_network.devops_net.name
  }
}