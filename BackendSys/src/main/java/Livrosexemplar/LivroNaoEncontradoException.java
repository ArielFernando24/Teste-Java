/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Livrosexemplar;

/**
 *
 * @author ariel
 */
class LivroNaoEncontradoException extends Exception {
    public LivroNaoEncontradoException(Long id) {
        super(String.format("Livro não encontrado para o id %d", id));
    }
}
