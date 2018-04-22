package com.rsone.blog.model;

import com.couchbase.client.java.repository.annotation.Field;
import com.couchbase.client.java.repository.annotation.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.couchbase.core.mapping.Document;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 * @author Abdelghani Roussi
 */

@Document
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {

    @Id
    private String userId;

    @Field
    @NotNull
    @Size(min = 4)
    private String username;

    @Field
    @NotNull
    private String email;

    @Field
    @NotNull
    @Size(min = 8)
    private String password;

    @Field
    private Boolean activated = false;

    @Field
    private Boolean disabled = true;
}
