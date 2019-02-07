package com.marb.demo.module.delayed.domain.api.dto;

import com.marb.demo.module.delayed.domain.model.EntityType;

public class DelayedCallRequestDto {
	private String systemCode;
	private String operationCode;
	private String payload;
	private EntityType mainEntityType;
	private long mainEntityId;

	public String getSystemCode() {
		return systemCode;
	}

	public String getOperationCode() {
		return operationCode;
	}

	public String getPayload() {
		return payload;
	}

	public EntityType getMainEntityType() {
		return mainEntityType;
	}

	public long getMainEntityId() {
		return mainEntityId;
	}

	private DelayedCallRequestDto(Builder builder) {
		systemCode = builder.systemCode;
		operationCode = builder.operationCode;
		payload = builder.payload;
		mainEntityType = builder.mainEntityType;
		mainEntityId = builder.mainEntityId;
	}

	public static Builder builder() {
		return new Builder();
	}

	public static final class Builder {
		private String systemCode;
		private String operationCode;
		private String payload;
		private EntityType mainEntityType;
		private long mainEntityId;

		private Builder() {
		}

		public Builder withSystemCode(String systemCode) {
			this.systemCode = systemCode;
			return this;
		}

		public Builder withOperationCode(String operationCode) {
			this.operationCode = operationCode;
			return this;
		}

		public Builder withPayload(String payload) {
			this.payload = payload;
			return this;
		}

		public Builder withMainEntityType(EntityType mainEntityType) {
			this.mainEntityType = mainEntityType;
			return this;
		}

		public Builder withMainEntityId(long mainEntityId) {
			this.mainEntityId = mainEntityId;
			return this;
		}

		public DelayedCallRequestDto build() {
			return new DelayedCallRequestDto(this);
		}
	}

	@Override
	public String toString() {
		return "DelayedCallRequestDto{" + "systemCode='" + systemCode + '\'' + ", operationCode='" + operationCode
				+ '\'' + ", payload='" + payload + '\'' + ", mainEntityType=" + mainEntityType + ", mainEntityId="
				+ mainEntityId + '}';
	}
}
