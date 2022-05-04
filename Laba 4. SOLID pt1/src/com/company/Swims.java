package com.company;

// Interface Segregation
// Ошибкой было бы создать один общий интерфейс для
// животных, swims - плавает, walks - ходит.
// Но в таком случае у некоторых животных был бы
// метод с пустой реализацией. Чтобы сделать код чище,
// я разбил один большой интерфейс на два маленьких.
// И теперь нет пустых зон в реализации интерфейса.

public interface Swims {
    void swims ();
}