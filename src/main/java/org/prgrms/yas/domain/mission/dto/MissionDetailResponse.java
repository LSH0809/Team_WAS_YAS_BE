package org.prgrms.yas.domain.mission.dto;

import java.util.Optional;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class MissionDetailResponse {
	
	private Long missionId;
	private String name;
	private Long durationGoalTime;
	private int orders;
	private String emoji;
	private String color;
	private Optional<MissionStatusDetailResponse> missionStatusDetailResponse;
	
	
	@Builder
	public MissionDetailResponse(
			Long missionId, String name, Long durationGoalTime, int orders, String emoji, String color,
			Optional<MissionStatusDetailResponse> missionStatusDetailResponse
	) {
		this.missionId = missionId;
		this.name = name;
		this.durationGoalTime = durationGoalTime;
		this.orders = orders;
		this.emoji = emoji;
		this.color = color;
		this.missionStatusDetailResponse = missionStatusDetailResponse;
	}
}
