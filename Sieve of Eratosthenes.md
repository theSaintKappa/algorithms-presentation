---
marp: true
theme: rose-pine-moon
style: |
    :root {
        font-family: 'CaskaydiaCove Nerd Font', sans-serif;
    }
author: Wojtek Zrałek
_class: lead
---

<style>
section.center > * {
  text-align: center;
}
</style>

<!-- _class: center -->

# Algorytm Sito Eratostenesa<br>(Sieve of Eratosthenes)

Wojtek Zrałek

---

# Wprowadzenie 🌟

> Służy on do znajdowania liczb pierwszych w danym przedziale `[2 ,n]`

> Został wymyślony przez greckiego matematyka Eratostenesa z Cyreny, który żył w latach _276_ - _194 p.n.e._

> Opiera się on na eliminacji liczby złożonych, czyli takich, które mają więcej niż dwa dzielniki, z przedziału `[2 ,n]` poprzez wykreślanie wielokrotności liczb pierwszych.

> Algorytm ten jest jednym z najstarszych wynalezionych algorytmów do znajdowania liczb pierwszych.

---

# Schemat blokowy

![bg right:72.5% 72.5%](./assets/block-diagram.png)

---

# Pseudokod 🧩

```python
n = input
T[n] = array<bool>

for s = 2, 3, 4, ..., n:
 T[s] = prawda

i = 2

while i * i <= n:
 if T[i] == True:
  j = i * i
  while j <= n:
   T[j] = False
   j = j + i
 i = i + 1

for a = 2, 3, 4, ..., n:
 if T[a] == True:
 print a
```

---

# Kod algorytmu w Javie ☕

```java
import java.util.Arrays;
import java.util.Scanner;

public class SieveOfEratosthenes {
    void main() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj liczbę n: ");
        int n = scanner.nextInt();

        boolean[] isPrime = new boolean[n + 1];
        Arrays.fill(isPrime, true);

        int i = 2;
        while (i * i <= n) {
            if (isPrime[i]) {
                int j = i * i;
                while (j <= n) {
                    isPrime[j] = false;
                    j = j + i;
                }
            }
            i = i + 1;
        }

        System.out.println("Liczby pierwsze od 2 do " + n + ":");
        for (int a = 2; a <= n; a++) {
            if (isPrime[a]) {
                System.out.print(a + " ");
            }
        }
    }
}
```

---

# Złożoność obliczeniowa ⏱️

> Dla zakresu do n, algorytm Sita Eratostenesa ma złożoność obliczeniową **`O(n log log n)`**.

> Jest to złożoność _<ins>asymptotyczna</ins>_, ponieważ zależy ona od rozmiaru danych wejściowych.

> Algorytm jest szybszy od takiego sprawdzającego każdą liczbę z zakresu od 2 do n.

---

# Operacja dominująca w algorytmie 📚

> W algorytmie Sita Eratostenesa operacją dominującą jest oznaczanie (czyli "wykreslanie" lub "odznaczanie") wielokrotności liczb pierwszych.

> Oznaczanie wielokrotności polega na ustawianiu flagi lub usuwaniu liczby z listy, co odpowiada operacji O(1) dla każdej zaznaczonej liczby.

---

# Zanimowanie działania algorytmu

![bg right:64% 80% drop-shadow](./assets/algorithm-animation.gif)
_Dla tablicy n = 120_

---

<!-- _class: center -->

# Dzięki 💜

---

<!-- _class: center -->

# Źródła 🔗

#### [Wikipedia](https://en.wikipedia.org/wiki/Sieve_of_Eratosthenes)

#### [zpe.gov.pl](https://zpe.gov.pl/pdf/P7MwVxKT0)

#### [ChatGPT](https://chat.openai.com/)
