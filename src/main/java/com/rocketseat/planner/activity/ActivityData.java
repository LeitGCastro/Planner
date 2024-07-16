package com.rocketseat.planner.activity;

import java.time.LocalDateTime;
import java.util.UUID;

public record ActivityData(
        UUID activityId,
        String title,
        LocalDateTime occursAt
) {
}
