package io.github.atuladhar.aman.T017TablePerHirarchy;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 * @author Aman Tuladhar
 * @since 2017-12-31
 */
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
class BaseUser {

    // becuase this is an entity we need identifier here
    // this means we don't need to add @Id on subclasses
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Character gender;
    private Integer age;
}
