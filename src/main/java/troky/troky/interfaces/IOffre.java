package troky.troky.interfaces;

import java.util.List;

public interface IOffre <T> {
    public void addOffre(T t);
    public void deleteOffre(T t);

    public void updateOffre(T t);
    public List<T> getAll();
}
