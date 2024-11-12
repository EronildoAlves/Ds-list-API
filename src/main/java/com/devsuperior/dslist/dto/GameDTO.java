package com.devsuperior.dslist.dto;

import com.devsuperior.dslist.entities.Game;

public record GameDTO(Long id, String title, Integer year, String imgUrl, String shortDescription) {

    public GameDTO(Game entity) {
        this(entity.getId(), entity.getTitle(), entity.getYear(), entity.getImgUrl(), entity.getShortDescription());
    }

}
