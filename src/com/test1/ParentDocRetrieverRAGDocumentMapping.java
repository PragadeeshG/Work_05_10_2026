package com.test1;

public class ParentDocRetrieverRAGDocumentMapping {
	private long documentMappingId;
	private long parentDocRetrieverConfigId;
	private String parentDocumentId;
	private String parentDoumentName;
	private String parentDcoumentSource;
	private String parentChunkId;
	private String childChunkIds;
	private long childChunkCount;
	private long parentContentSize;
	private long parentTokenCount;
	private String documentVersion;
	private String documentSection;
	private String documentMetadata;
	private String embeddingReference;
	private String indexingStatus;
	private String mappingCreatedTime;
	private String lastUpdatedTime;

	public ParentDocRetrieverRAGDocumentMapping() {

	}

	public ParentDocRetrieverRAGDocumentMapping(long documentMappingId, long parentDocRetrieverConfigId,
			String parentDocumentId, String parentDoumentName, String parentDcoumentSource, String parentChunkId,
			String childChunkIds, long childChunkCount, long parentContentSize, long parentTokenCount,
			String documentVersion, String documentSection, String documentMetadata, String embeddingReference,
			String indexingStatus, String mappingCreatedTime, String lastUpdatedTime) {
		super();
		this.documentMappingId = documentMappingId;
		this.parentDocRetrieverConfigId = parentDocRetrieverConfigId;
		this.parentDocumentId = parentDocumentId;
		this.parentDoumentName = parentDoumentName;
		this.parentDcoumentSource = parentDcoumentSource;
		this.parentChunkId = parentChunkId;
		this.childChunkIds = childChunkIds;
		this.childChunkCount = childChunkCount;
		this.parentContentSize = parentContentSize;
		this.parentTokenCount = parentTokenCount;
		this.documentVersion = documentVersion;
		this.documentSection = documentSection;
		this.documentMetadata = documentMetadata;
		this.embeddingReference = embeddingReference;
		this.indexingStatus = indexingStatus;
		this.mappingCreatedTime = mappingCreatedTime;
		this.lastUpdatedTime = lastUpdatedTime;
	}

	public long getDocumentMappingId() {
		return documentMappingId;
	}

	public void setDocumentMappingId(long documentMappingId) {
		this.documentMappingId = documentMappingId;
	}

	public long getParentDocRetrieverConfigId() {
		return parentDocRetrieverConfigId;
	}

	public void setParentDocRetrieverConfigId(long parentDocRetrieverConfigId) {
		this.parentDocRetrieverConfigId = parentDocRetrieverConfigId;
	}

	public String getParentDocumentId() {
		return parentDocumentId;
	}

	public void setParentDocumentId(String parentDocumentId) {
		this.parentDocumentId = parentDocumentId;
	}

	public String getParentDoumentName() {
		return parentDoumentName;
	}

	public void setParentDoumentName(String parentDoumentName) {
		this.parentDoumentName = parentDoumentName;
	}

	public String getParentDcoumentSource() {
		return parentDcoumentSource;
	}

	public void setParentDcoumentSource(String parentDcoumentSource) {
		this.parentDcoumentSource = parentDcoumentSource;
	}

	public String getParentChunkId() {
		return parentChunkId;
	}

	public void setParentChunkId(String parentChunkId) {
		this.parentChunkId = parentChunkId;
	}

	public String getChildChunkIds() {
		return childChunkIds;
	}

	public void setChildChunkIds(String childChunkIds) {
		this.childChunkIds = childChunkIds;
	}

	public long getChildChunkCount() {
		return childChunkCount;
	}

	public void setChildChunkCount(long childChunkCount) {
		this.childChunkCount = childChunkCount;
	}

	public long getParentContentSize() {
		return parentContentSize;
	}

	public void setParentContentSize(long parentContentSize) {
		this.parentContentSize = parentContentSize;
	}

	public long getParentTokenCount() {
		return parentTokenCount;
	}

	public void setParentTokenCount(long parentTokenCount) {
		this.parentTokenCount = parentTokenCount;
	}

	public String getDocumentVersion() {
		return documentVersion;
	}

	public void setDocumentVersion(String documentVersion) {
		this.documentVersion = documentVersion;
	}

	public String getDocumentSection() {
		return documentSection;
	}

	public void setDocumentSection(String documentSection) {
		this.documentSection = documentSection;
	}

	public String getDocumentMetadata() {
		return documentMetadata;
	}

	public void setDocumentMetadata(String documentMetadata) {
		this.documentMetadata = documentMetadata;
	}

	public String getEmbeddingReference() {
		return embeddingReference;
	}

	public void setEmbeddingReference(String embeddingReference) {
		this.embeddingReference = embeddingReference;
	}

	public String getIndexingStatus() {
		return indexingStatus;
	}

	public void setIndexingStatus(String indexingStatus) {
		this.indexingStatus = indexingStatus;
	}

	public String getMappingCreatedTime() {
		return mappingCreatedTime;
	}

	public void setMappingCreatedTime(String mappingCreatedTime) {
		this.mappingCreatedTime = mappingCreatedTime;
	}

	public String getLastUpdatedTime() {
		return lastUpdatedTime;
	}

	public void setLastUpdatedTime(String lastUpdatedTime) {
		this.lastUpdatedTime = lastUpdatedTime;
	}

}
