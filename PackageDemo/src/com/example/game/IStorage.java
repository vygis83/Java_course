package com.example.game;

import java.util.List;

/**
 * Created by Vygis on 02/01/2016.
 */
public interface IStorage {
    List<String> write();
    void read(List<String> savedValues);
}
