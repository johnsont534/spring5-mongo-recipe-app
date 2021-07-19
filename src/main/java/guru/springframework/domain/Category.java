package guru.springframework.domain;

import lombok.Getter;
import lombok.Setter;

import java.util.Set;

import org.springframework.data.mongodb.core.mapping.Document;

/**
 * Created by jt on 6/13/17.
 */
@Getter
@Setter
@Document
public class Category {
    private String id;
    private String description;
    private Set<Recipe> recipes;
}
