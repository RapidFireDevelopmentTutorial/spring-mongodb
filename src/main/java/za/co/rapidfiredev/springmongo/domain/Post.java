package za.co.rapidfiredev.springmongo.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document(collection = "post")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Post {

    @Id
    private String id;
    @Field
    private String subject;
    @Field
    private String message;
    @Field
    private int likes;

}
