package efrei.fr.domain;

import java.io.Serializable;

public class Race implements Serializable
{
    private String id;
    private String description;

    private Race()
    {
    }

    private Race(Builder builder)
    {
        this.id = builder.id;
        this.description = builder.description;
    }


    public String getId()
    {
        return id;
    }

    public String getDescription()
    {
        return description;
    }

    @Override
    public String toString() {
        return "Race{" +
                "id='" + id + '\'' +
                ", description='" + description + '\'' +
                '}' + "\n";
    }

    public static class Builder
    {
        private String id;
        private String description;

        public Builder setId(String id)
        {
            this.id = id;
            return this;
        }

        public Builder setDescription(String description)
        {
            this.description = description;
            return this;
        }
        public Builder copy(Race race)
        {
            this.id = race.id;
            this.description=race.description;
            return this;
        }

        public Race build()
        {
            return new Race(this);
        }
    }
}

