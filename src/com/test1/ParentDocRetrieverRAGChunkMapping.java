package com.test1;

public class ParentDocRetrieverRAGChunkMapping {
	private long chunkMappingId;
	private long parentDocRetrieverConfigId;
	private String parentDocumentId;
	private String parentChunkId;
	private String childChunkId;
	private long childChunkSequence;
	private String childChunkContent;
	private long childChunkTokenCount;
	private long chunkStartPosition;
	private long chunkEndPosition;
	private long chunkOverlap;
	private String embeddingReference;
	private String embeddingModel;
	private String vectorIndexId;
	private String semanticCategory;
	private String chunkImportanceScore;
	private String chunkMetadata;
	private String indexingTime;

	public ParentDocRetrieverRAGChunkMapping() {

	}

	public ParentDocRetrieverRAGChunkMapping(long chunkMappingId, long parentDocRetrieverConfigId,
			String parentDocumentId, String parentChunkId, String childChunkId, long childChunkSequence,
			String childChunkContent, long childChunkTokenCount, long chunkStartPosition, long chunkEndPosition,
			long chunkOverlap, String embeddingReference, String embeddingModel, String vectorIndexId,
			String semanticCategory, String chunkImportanceScore, String chunkMetadata, String indexingTime) {
		super();
		this.chunkMappingId = chunkMappingId;
		this.parentDocRetrieverConfigId = parentDocRetrieverConfigId;
		this.parentDocumentId = parentDocumentId;
		this.parentChunkId = parentChunkId;
		this.childChunkId = childChunkId;
		this.childChunkSequence = childChunkSequence;
		this.childChunkContent = childChunkContent;
		this.childChunkTokenCount = childChunkTokenCount;
		this.chunkStartPosition = chunkStartPosition;
		this.chunkEndPosition = chunkEndPosition;
		this.chunkOverlap = chunkOverlap;
		this.embeddingReference = embeddingReference;
		this.embeddingModel = embeddingModel;
		this.vectorIndexId = vectorIndexId;
		this.semanticCategory = semanticCategory;
		this.chunkImportanceScore = chunkImportanceScore;
		this.chunkMetadata = chunkMetadata;
		this.indexingTime = indexingTime;
	}

	public long getChunkMappingId() {
		return chunkMappingId;
	}

	public void setChunkMappingId(long chunkMappingId) {
		this.chunkMappingId = chunkMappingId;
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

	public String getParentChunkId() {
		return parentChunkId;
	}

	public void setParentChunkId(String parentChunkId) {
		this.parentChunkId = parentChunkId;
	}

	public String getChildChunkId() {
		return childChunkId;
	}

	public void setChildChunkId(String childChunkId) {
		this.childChunkId = childChunkId;
	}

	public long getChildChunkSequence() {
		return childChunkSequence;
	}

	public void setChildChunkSequence(long childChunkSequence) {
		this.childChunkSequence = childChunkSequence;
	}

	public String getChildChunkContent() {
		return childChunkContent;
	}

	public void setChildChunkContent(String childChunkContent) {
		this.childChunkContent = childChunkContent;
	}

	public long getChildChunkTokenCount() {
		return childChunkTokenCount;
	}

	public void setChildChunkTokenCount(long childChunkTokenCount) {
		this.childChunkTokenCount = childChunkTokenCount;
	}

	public long getChunkStartPosition() {
		return chunkStartPosition;
	}

	public void setChunkStartPosition(long chunkStartPosition) {
		this.chunkStartPosition = chunkStartPosition;
	}

	public long getChunkEndPosition() {
		return chunkEndPosition;
	}

	public void setChunkEndPosition(long chunkEndPosition) {
		this.chunkEndPosition = chunkEndPosition;
	}

	public long getChunkOverlap() {
		return chunkOverlap;
	}

	public void setChunkOverlap(long chunkOverlap) {
		this.chunkOverlap = chunkOverlap;
	}

	public String getEmbeddingReference() {
		return embeddingReference;
	}

	public void setEmbeddingReference(String embeddingReference) {
		this.embeddingReference = embeddingReference;
	}

	public String getEmbeddingModel() {
		return embeddingModel;
	}

	public void setEmbeddingModel(String embeddingModel) {
		this.embeddingModel = embeddingModel;
	}

	public String getVectorIndexId() {
		return vectorIndexId;
	}

	public void setVectorIndexId(String vectorIndexId) {
		this.vectorIndexId = vectorIndexId;
	}

	public String getSemanticCategory() {
		return semanticCategory;
	}

	public void setSemanticCategory(String semanticCategory) {
		this.semanticCategory = semanticCategory;
	}

	public String getChunkImportanceScore() {
		return chunkImportanceScore;
	}

	public void setChunkImportanceScore(String chunkImportanceScore) {
		this.chunkImportanceScore = chunkImportanceScore;
	}

	public String getChunkMetadata() {
		return chunkMetadata;
	}

	public void setChunkMetadata(String chunkMetadata) {
		this.chunkMetadata = chunkMetadata;
	}

	public String getIndexingTime() {
		return indexingTime;
	}

	public void setIndexingTime(String indexingTime) {
		this.indexingTime = indexingTime;
	}

}
