/*
 * Hibernate, Relational Persistence for Idiomatic Java
 *
 * License: GNU Lesser General Public License (LGPL), version 2.1 or later.
 * See the lgpl.txt file in the root directory or <http://www.gnu.org/licenses/lgpl-2.1.html>.
 */

/**
 * A set of mapping annotations which extend the O/R mapping annotations defined by JPA.
 *
 * <h2 id="basic-value-mapping">Basic value type mappings</h2>
 *
 * JPA supports a very limited set of built-in {@linkplain jakarta.persistence.Basic basic}
 * types, and provides only {@linkplain jakarta.persistence.AttributeConverter converters}
 * as a solution when the built-in types are insufficient.
 * <p>
 * By contrast, Hibernate has an embarrassingly rich set of abstractions for modelling
 * "basic" types, which can be initially confusing. Note that the venerable interface
 * {@link org.hibernate.type.Type} abstracts over all sorts of field and property types,
 * not only basic types. In modern Hibernate, programs should avoid directly implementing
 * this interface.
 * <p>
 * Instead, a program should use either a "compositional" basic type, or in more extreme
 * cases, a {@code UserType}.
 * <ul>
 * <li>
 *     A basic type is a composition of a {@link org.hibernate.type.descriptor.java.JavaType}
 *     with a {@link org.hibernate.type.descriptor.jdbc.JdbcType}, and possibly a JPA
 *     {@link jakarta.persistence.AttributeConverter}, and the process of composition is
 *     usually somewhat implicit. A program may influence the choice of {@code JavaType}
 *     or {@code JdbcType} using any of the following annotations:
 *     <ul>
 *     <li>{@link org.hibernate.annotations.JavaType}
 *     <li>{@link org.hibernate.annotations.JdbcType}
 *     <li>{@link org.hibernate.annotations.JdbcTypeCode}
 *     <li>{@link org.hibernate.annotations.Mutability}
 *     <li>{@link jakarta.persistence.Convert}
 *     <li>{@link jakarta.persistence.Lob}
 *     <li>{@link jakarta.persistence.Enumerated}
 *     <li>{@link jakarta.persistence.Temporal}
 *     <li>{@link org.hibernate.annotations.Nationalized}
 *     </ul>
 *     Note that {@link org.hibernate.annotations.JavaType}, {@link org.hibernate.annotations.JdbcType},
 *     {@link org.hibernate.annotations.JdbcTypeCode} and {@link org.hibernate.annotations.Mutability}
 *     all come in specialized flavors for handling map keys, list indexes, and so on.
 * <li>
 *     Alternatively, a program may implement the {@link org.hibernate.usertype.UserType}
 *     interface and associate it with a field or property explicitly using the
 *     {@link org.hibernate.annotations.Type @Type} annotation, or implicitly using the
 *     {@link org.hibernate.annotations.TypeRegistration @TypeRegistration} annotation.
 *     There are some specialized flavors of the {@code @Type} annotation too.
 *     </li>
 * </ul>
 * <p>
 * These two approaches cannot be used together. A {@code UserType} always takes precedence
 * over the compositional approach.
 * <p>
 * Please see the User Guide for a more in-depth discussion.
 */
package org.hibernate.annotations;
