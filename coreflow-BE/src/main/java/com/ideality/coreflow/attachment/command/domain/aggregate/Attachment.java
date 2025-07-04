package com.ideality.coreflow.attachment.command.domain.aggregate;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Table(name="attachment")
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
public class Attachment {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private Long id;

	@Column(name="origin_name", nullable=false, length=255)
	private String originName;

	@Column(name="stored_name", nullable=false, length=255)
	private String storedName;

	@Column(name="url", nullable=false, length=255)
	private String url;

	@Column(name="file_type", nullable=false, length=255)
	private String fileType;

	@Column(name="size", nullable=false, length=255)
	private String size;

	@Column(name="upload_at", nullable=false)
	private LocalDateTime uploadAt;

	@Column(name="target_type")
	@Enumerated(EnumType.STRING)
	private FileTargetType targetType;

	@Column(name="target_id", nullable=false)
	private Long targetId;

	@Column(name="uploader_id", nullable=false)
	private Long uploaderId;

	@Column(name="is_deleted", nullable=false)
	@Builder.Default
	private Boolean isDeleted = false;

	@Column(name="deleted_at")
	private LocalDateTime deletedAt;

	// 첨부파일 정보 수정
	public void updateInfo(String fileName, String fileUrl, String size, Long uploaderId) {
		this.storedName = fileName;
		this.url = fileUrl;
		this.size = size;
		this.uploaderId = uploaderId;
		this.uploadAt = LocalDateTime.now();
		// TODO. 업로드 수정도 필요
	}

	public void delete() {
		this.isDeleted = true;
		this.deletedAt = LocalDateTime.now();
	}
}
