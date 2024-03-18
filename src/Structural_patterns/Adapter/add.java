package Structural_patterns.Adapter;
//Адаптер для конвертации единиц измерения:

 //       Предположим, у вас есть приложение для фитнеса, которое отслеживает пробег пользователя в километрах. Однако пользователю удобнее измерять пробег в милях. Создайте адаптер, который позволит вашему приложению конвертировать расстояние из километров в мили и наоборот, обеспечивая пользователю возможность выбора предпочтительной единицы измерения. Это позволит улучшить пользовательский опыт и сделать приложение более удобным для использования.
//Отже, обидва ці підходи до адаптації мають однакову загальну мету створення, але можуть використовуватися в різних ситуаціях залежно від конкретних потреб та умов програми. Наприклад, клас-адаптер (TemperatureClassReporter) може бути використаний, якщо потрібно розширити функціональність базового класу, а об'єкт-адаптер (TemperatureObjectReporter) може бути корисним для використання існуючого класу без зміни його структури.
public class add {
 public static void main(String[] args){
  //adapter
  System.out.println("Just adapter: ");
  distanceCounter distanceCounter = new class_adapter();
  infoDist(distanceCounter);

  //object adapter
  System.out.println("...and object adapter: ");
  distanceCounter = new class_adapter_object();
  infoDist(distanceCounter);
 }

 public  static void infoDist(distanceCounter distanceCounter){
  distanceCounter.setDistanceInKilometer(5);
  System.out.println("distance in Km: " + distanceCounter.getDistanceInKilometer());
  System.out.println("distance in Mile: " + distanceCounter.getDistanceInMileage());

  distanceCounter.setDistanceInMileage(10);
  System.out.println("distance in Km: " + distanceCounter.getDistanceInKilometer());
  System.out.println("distance in Mile: " + distanceCounter.getDistanceInMileage());

 }
}
