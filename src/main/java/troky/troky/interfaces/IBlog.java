package troky.troky.interfaces;

import java.util.List;

public interface IBlog<T> {
    public void addBlog(T t);
    public void deleteBlog(T t);

    public void updateBlog(T t);
    public List<T> recupererBlog();
}
