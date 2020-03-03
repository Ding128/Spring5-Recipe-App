package guru.springframework.spring5recipeapp.domain;

import javax.persistence.*;

@Entity
public class Note {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne
    private Recipe recipe;
    private String recipteNotes;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Recipe getRecipe() {
        return recipe;
    }

    public void setRecipe(Recipe recipe) {
        this.recipe = recipe;
    }

    public String getRecipteNotes() {
        return recipteNotes;
    }

    public void setRecipteNotes(String recipteNotes) {
        this.recipteNotes = recipteNotes;
    }
}
