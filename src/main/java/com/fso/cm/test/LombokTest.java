package com.fso.cm.test;

import com.fso.cm.model.TodoEntity;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class LombokTest {
    public static void main(String[] args) {
        DemoModel model = new DemoModel("FSO");
        log.info("--------------------" + "오잉 한글...");
        log.info("Model => " + model.getId());

        //빌드메서드
        TodoEntity todo = TodoEntity.builder()
                .id("t-20220506")
                .userId("developer")
                .title("Implement Model")
                .build()
                ;
        log.info("todo toString ===> " + todo.toString());

    }
}
