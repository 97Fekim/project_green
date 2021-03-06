package com.group3.project_green.memberInfo.service;

import com.group3.project_green.DTO.PostDTO;
import com.group3.project_green.entity.Post;

import java.util.List;

public interface MyPostListService {

    List<PostDTO> getListByMemberId(Long id);

    default Post dtoToEntity(PostDTO dto){
        Post post =Post.builder()
                .pno(dto.getPno())
                .accom(dto.getAccom())
                .content(dto.getContent())
                .food(dto.getFood())
                .likeNum(dto.getLikeNum())
                .member(dto.getMember())
                .sights(dto.getSights())
                .title(dto.getTitle())
                .build();
        return post;
    }

    default PostDTO entityToDTO(Post post){
        PostDTO postDTO = PostDTO.builder()
                .pno(post.getPno())
                .title(post.getTitle())
                .sights(post.getSights())
                .member(post.getMember())
                .likeNum(post.getLikeNum())
                .food(post.getFood())
                .content(post.getContent())
                .accom(post.getAccom())
                .regDate(post.getRegDate())
                .modDate(post.getModDate())
                .build();
        return postDTO;

    }

}
