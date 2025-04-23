package Controllers;

import Models.Book;

public class BookController {

    public boolean sortByName(Book[] libros) {
            for (int i = 0; i < libros.length - 1; i++) {
                if (libros[i].getName().compareTo(libros[i + 1].getName()) < 0) return false;
            }
            return true;
    }

    public Book searchByName(Book[] libros, String name) {
            int bajo = 0, name = libros.length - 1;
            while (  bajo <= name) {
                int central = ( bajo + name) / 2;
                int cmp = libros[central].getName().compareTo(name);
                if (cmp == 0) return libros[central];
                if (cmp < 0) bajo = central + 1;
                else name = central - 1;
            }
            return null;
    }
}
