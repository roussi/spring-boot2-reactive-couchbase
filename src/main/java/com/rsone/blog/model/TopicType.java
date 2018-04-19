package com.rsone.blog.model;

import com.couchbase.client.java.repository.annotation.Field;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.couchbase.core.mapping.Document;

import javax.validation.constraints.NotNull;

/**
 * @author Abdelghani Roussi
 */

@Document
@Data
@AllArgsConstructor
@NoArgsConstructor
public class TopicType {

    @Id
    private String topicTypeId;

    @Field
    @NotNull
    private String topicTypeName;
}
