/*
 * Dezentrale Members Administration
 * An API and application to administer the members of the hackspace dezentrale in Leipzig.
 *
 * The version of the OpenAPI document: @project.version@
 * Contact: p1ng0ut@mailbox.org
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package space.dezentrale.members.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.*;

import javax.validation.constraints.*;
import javax.validation.Valid;
import io.micronaut.core.annotation.*;
import javax.annotation.Generated;
import io.swagger.v3.oas.annotations.media.Schema;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Gets or Sets MemberType
 */
@Introspected
public enum MemberType {
    REGULAR("REGULAR"),
    SUPPORTING("SUPPORTING");

    private String value;

    MemberType(String value) {
        this.value = value;
    }

    @JsonValue
    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    @JsonCreator
    public static MemberType fromValue(String value) {
        for (MemberType b : MemberType.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}
