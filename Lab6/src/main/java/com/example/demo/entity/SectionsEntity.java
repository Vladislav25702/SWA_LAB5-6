package com.example.demo.entity;
//import jakarta.persistence.*;
import jakarta.persistence.*;

@Entity
@Table(name = "sections", schema = "users")
public class SectionsEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "Section_Id")
    private int section_Id;
    @Basic
    @Column(name = "Section")
    private String section;

    public int getSectionId() {
        return section_Id;
    }

    public void setSectionId(int sectionId) {
        this.section_Id = sectionId;
    }

    public String getSection() {
        return section;
    }

    public void setSection(String section) {
        this.section = section;
    }

    public SectionsEntity(String name){
        this.section=name;
    }
    public SectionsEntity(){

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        SectionsEntity that = (SectionsEntity) o;

        if (section_Id != that.section_Id) return false;
        if (section != null ? !section.equals(that.section) : that.section != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        Integer result = section_Id;
        result = 31 * result + (section != null ? section.hashCode() : 0);
        return Math.toIntExact(result);
    }
}
