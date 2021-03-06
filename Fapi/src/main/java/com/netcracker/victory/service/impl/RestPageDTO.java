package com.netcracker.victory.service.impl;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.JsonNode;
import com.netcracker.victory.models.DTO.TaskDTO;
import com.netcracker.victory.models.TaskModel;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;

import java.util.ArrayList;
import java.util.List;

public class RestPageDTO extends PageImpl<TaskDTO> {
        @JsonCreator(mode = JsonCreator.Mode.PROPERTIES)
        public RestPageDTO(@JsonProperty("content") List<TaskDTO> content,
                             @JsonProperty("number") int number,
                             @JsonProperty("size") int size,
                             @JsonProperty("totalElements") Long totalElements,
                             @JsonProperty("pageable") JsonNode pageable,
                             @JsonProperty("last") boolean last,
                             @JsonProperty("totalPages") int totalPages,
                             @JsonProperty("sort") JsonNode sort,
                             @JsonProperty("first") boolean first,
                             @JsonProperty("numberOfElements") int numberOfElements) {
            super(content, PageRequest.of(number, size), totalElements);
        }
        public RestPageDTO(List<TaskDTO> content, Pageable pageable, long total) {
            super(content, pageable, total);
        }

        public RestPageDTO(List<TaskDTO> content) {
            super(content);
        }

        public RestPageDTO() {
            super(new ArrayList<>());
        }
    }


