package common;

import com.github.javafaker.Faker;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class SetData {
    private static POJO pojo;
    private static Random random;

    public SetData() {
        pojo = new POJO();
        random = new Random();
    }

    public POJO setRandomData() {
        POJO data = new POJO();
        data.setName(randomName());
        data.setSkill(randomSkill());
        data.setId(Config.getID());
        data.setBatch(randomYear());
        return data;
    }

    public String randomYear() {
        int startYear = 1950;
        int endYear = 2024;
        return String.valueOf(random.nextInt(endYear - startYear + 1) + startYear);

    }

    public String randomName() {
        Faker faker = new Faker();
        return faker.name().firstName();
    }

    public String[] randomSkill() {
        List<String> skills = new ArrayList<>();
        skills.add("Driving");
        skills.add("Cooking");
        skills.add("Singing");
        skills.add("Sleeping");
        skills.add("Gardening");
        skills.add("Writing");
        skills.add("Guitar");
        skills.add("Swimming");
        skills.add("Teaching");
        skills.add("Lawyer");

        Collections.shuffle(skills);

        int numberOfSkills = 2;
        List<String> uniqueSkills = skills.subList(0, numberOfSkills);

        return uniqueSkills.toArray(new String[0]);
    }

}
