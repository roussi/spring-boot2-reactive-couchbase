package com.rsone.blog.model;

import com.couchbase.client.java.repository.annotation.Field;
import com.couchbase.client.java.repository.annotation.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.couchbase.core.mapping.Document;

import javax.validation.constraints.NotNull;

/**
 * @author Abdelghani Roussi
 */

@Document
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Topic {

    @Id
    String topicId;

    @Field
    @NotNull
    String topicName;
}
