package com.fso.cm.model;

import lombok.*;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
@ToString
public class TodoEntity {

    private String id;
    private String userId;
    private String title;
    private boolean done; //true - todo 를 완료한 경우(checked)

}
