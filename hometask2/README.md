Сущности: `Post`, `Comment` к посту — оба являются `Likeable`.

К ним есть соответствующие базы данных. К базам можно сделать `select`-запрос:

- Пост по id.
- Комментарии к посту.
- Число лайков на сущности после её получения.

Также есть комманды:

- Сделать пост.
- Оставить комментари под постом.
- Лайкнуть сущность.


Очевидно, что пользователи будут просматривать посты или читать комментарии гораздо больше, чем делать эти посты или оставлять комментарии.  
Поэтому нужно оптимизировать операции на чтение путём увеличения числа табличек в базе данных: `DatabaseOfComments` & `Posts`.
