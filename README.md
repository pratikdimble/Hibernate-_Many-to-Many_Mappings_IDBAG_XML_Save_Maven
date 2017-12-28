# Hibernate-_Many-to-Many_Mappings_IDBAG_XML_Save_Maven
Hibernate's &lt;idbag> facility allows you to map many-to-many associations and collections of values to a single table with a surrogate key

The majority of the many-to-many associations and collections of values shown previously all map to tables with composite keys, even though it has been have suggested that entities should have synthetic identifiers (surrogate keys). A pure association table does not seem to benefit much from a surrogate key, although a collection of composite values might. It is for this reason that Hibernate provides a feature that allows you to map many-to-many associations and collections of values to a table with a surrogate key.

The <idbag> element lets you map a List (or Collection) with bag semantics. For example:

<idbag name="lovers" table="LOVERS">
    <collection-id column="ID" type="long">
        <generator class="sequence"/>
    </collection-id>
    <key column="PERSON1"/>
    <many-to-many column="PERSON2" class="Person" fetch="join"/>
</idbag>


# An <idbag> has a synthetic id generator, just like an entity class. 
  A different surrogate key is assigned to each collection row. Hibernate does not, however, provide any mechanism for discovering the surrogate key value of a particular row.

The update performance of an <idbag> supersedes a regular <bag>. Hibernate can locate individual rows efficiently and update or delete them individually, similar to a list, map or set.
  
