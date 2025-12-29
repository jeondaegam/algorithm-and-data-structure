package codeUp;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class Q_1026Test {

    @Test
    void returnMinute() {
        Q_1026 quest = new Q_1026();

        // 시분초 입력받아 분만 출력하기
        assertThat(quest.returnMinute("17:20:26")).isEqualTo("20");
    }
}