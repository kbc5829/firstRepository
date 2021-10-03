package com.example.siwol;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

public class StringTest {

    @Test
    void testsiwolTo() {
//       List<String> list = new ArrayList<>();
//       list.add("1");
//       list.add("2");
//       assertThat(list).contains("1","2");

        String data = "1,2";
        String[] results = data.split(",");
        assertThat(results).contains("2", "1");
    }

    @Test
    void testsiwol2To () {
        String str ="(1,2)";
        str = str.substring(1, 4);
        assertThat(str).contains("1,2");
    }

    @Test
    @DisplayName("StringIndexOutOfBoundsException 예외처리 테스트")
    void testsiwol3To () {
        String str ="abc";
        assertThatThrownBy(() -> {
            char data = str.charAt(3);
        }).isInstanceOf(StringIndexOutOfBoundsException.class)
                .hasMessageContaining("ㅇ0ㅇ00ㅇ0ㅇ0ㅇㅇㅇ");
    }

}
