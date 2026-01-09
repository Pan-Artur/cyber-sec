HTTP Client(Java);

URL це адреса ресурсу в інтернеті;
В Java є клас java.net.URL;

Як виглядає створення запиту в Java:
  1.Створюємо рядок з адресою: 
    String urlString = "https://...";
  2.Створюємо об'єкт URL: 
    URL url = new URL(urlString);
  3.Відкриваємо з'єднання: 
    HttpURLConnection connection = (HttpURLConnection) url.openConnection();

    (HttpURLConnection) це приведення типу;
    Ми кажемо Java: "Я знаю, це точно http-з'єднання";
  4.Вказуємо метод: 
    connection.setRequestMethod("GET");

Як отримати відповідь:
  Status code:
    connection.getResponseCode();
  Status line:
    connection.getHeaderField(0);
  Headers:
    connection.getHeaderFields();
  Body:
    connection.getInputStream();

TCP це надійний протокол доставки байтів між комп'ютерами(гарантує доставку, порядок і надійність);

Java сама:
  -відкриває TCP-з'єднання;
  -шле HTTP-запит;
  -приймає відповідь;
Ми просто читаємо результат.

InputStream це потік байтів, які можна зчитати за допомогою InputStreamReader, і в нас вийдуть символи, а ці символи можна зчитати за допомогою BufferedReader, і в нас вийдуть з'єднані символами блоки.

Читаємо в циклі, допоки reader.readLine() не видасть кінець останнього рядка, null.

Метод close(), як в прикладі reader.close() потрібен для того, щоб закінчити операцію, щоб не було перевантаження і витоку пам'яті.

HTTP-відповідь це потік даних, бо ми отримуємо те, що попросили.
