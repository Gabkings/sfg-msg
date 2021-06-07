package com.gabkings.sfgmsg.model;

import lombok.*;

import java.io.Serializable;
import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class HelloWorld implements Serializable {
    private UUID id;
    private String message;
}
