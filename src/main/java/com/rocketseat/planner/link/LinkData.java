package com.rocketseat.planner.link;

import java.util.UUID;

public record LinkData(
        UUID linkId,
        String title,
        String url
) {
}
