variable "minio_user" {
  description = "MinIO root user"
  type        = string
  default     = "minioadmin"
}

variable "minio_password" {
  description = "MinIO root password"
  type        = string
  default     = "minioadmin123"
  sensitive   = true
}
