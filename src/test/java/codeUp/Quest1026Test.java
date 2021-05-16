package codeUp;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class Quest1026Test {

    @Test
    void returnMinute() {
        Quest1026 quest = new Quest1026();

        // 시분초 입력받아 분만 출력하기
        assertThat(quest.returnMinute("17:20:26")).isEqualTo("20");
    }
}