package com.group3.project_green.entity;

import com.group3.project_green.BaseEntity;
import com.group3.project_green.DTO.ProfileImageDTO;
import lombok.*;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class MemberInfo extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long ino;

    @ManyToOne
    private Member member;

    private String name;

    private String phone;

    private String birthDate;

    private String address;

    private String detailAddress;

    private String location;

    private String favoriteFood;
    private String favoriteAccom;
    private String favoriteLocation;

    //프로필 사진추가를 위한 칼럼
    @Transient
    private List<ProfileImageDTO> profileImageDTOList = new ArrayList<>();

}
