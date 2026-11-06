package com.mysite.springboot4.dto;

import java.util.List;

public record WritingSuggestionsResponse(List<String> suggestions) {
}