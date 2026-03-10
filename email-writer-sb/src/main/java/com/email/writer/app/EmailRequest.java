package com.email.writer.app;

import lombok.Data;

@Data
public class EmailRequest {
    private String emailContent;//content of the email we are creating reply for
    private String tone;//tone of the reply

}
