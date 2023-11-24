Tiene un ".exe" y un ".jar" cada uno es sus conrrespondientes lugares, a mi me funcionan ambos pero estuve haciendo un testeo en otra computadora y no le funciono el 
".exe".
 
1-En la ventana de registrarse el mensaje de error solo aparece si solo hay un campo vacio, en cuyo caso mostrara un mensaje diciendo que falta ese campo; de ser mayor
de 1 o ya existir ese nombre de usuario, no saltara un mensaje de error, pero se quedara en dicha pantalla, poque la database tiene todos sus campos como "not null".

2-En el "CRUD" no encontre manera de poder hacer cambiar el "Username" sin que me explotara el resto del programa, ese es el unico dato en el "CRUD" que no se puede
modificar.

3-Ahora ni siquiera me quiere correr el ".jar", espero el video se suficiente evidencia, le hice las modificaciones que dije en el video (no, no so la causantes, 
porque incluso antes de ellos si creaba un ".jar" no me solo me funcionaba la pantalla de login y registar), pero no ".jar", aunque si borro el jar me corre normal 
en Neatbeans.

*Nota: Era el path de la conexión, que poralguna razón dejo de funcionar, incluso si el jar se ejecutaba normalmente con el path que estaba dado. Ahora aunque se tenga
java, el programa no funciona si no se tiene el path "jdbc:sqlite:C:\\Users\\Admin\\Documents\\TareaForm\\db\\registro_usuarios.s3db", por lo cual no funcionaria en 
otra pc (no es que lo hiciera anteriormente). No entiendo nada de esto, no tiene sentido, porque me habia trabajado sin problemas con el path 
"jdbc:sqlite:db\\registro_usuarios.s3db".
