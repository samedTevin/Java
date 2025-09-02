public interface IEntityRepository<T extends IEntity>{ // generic constraints

    void add(T entity);
    void delete(T entity);
    void update(T entity);



}
