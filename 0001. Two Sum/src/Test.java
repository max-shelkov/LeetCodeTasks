public class Test {

/*
('2 Л`орд, ООО','2 Л`Орд, ООО','местная','2670','2269.5',NULL,NULL,NULL,NULL,NULL,'Малинова Олеся Юрьевна','2020-11-01','2021-04-30','6'),
('53РусБал, автосервис по ремонту грузовых автомобилей','53РусБал, ООО','местная','2670','2670','391.02',NULL,NULL,NULL,NULL,'Орлова Ольга Александровна','2021-02-01','2021-07-31','6'),
('Aqua, кафе','Михалёва А. В., ИП','местная','2670','2670','2670',NULL,NULL,NULL,NULL,'Тараканова Анастасия Валерьевна','2021-02-01','2021-05-31','4'),
('Bella Casa, салон','Андреева Г.Г., ИП','местная','2670','2136',NULL,NULL,NULL,NULL,NULL,'Малинова Олеся Юрьевна','2020-09-01','2021-02-28','6'),
('BEREG, суши-бар','Мнацян Р. Г., ИП','местная','4230','2961','0',NULL,NULL,NULL,NULL,'Малинова Олеся Юрьевна','2020-09-01','2021-08-31','12'),
('Brewmen Restaurant & Brewery','Солод и Хмель, ООО','местная','2670','2269.5',NULL,NULL,NULL,'4539','2021-02-08','Орлова Ольга Александровна','2021-01-01','2021-06-30','6'),
('British English, студия иностранных языков','Невод, ООО','местная','2670','2670',NULL,NULL,NULL,NULL,NULL,'Степанова Анастасия Сергеевна','2020-12-01','2021-03-31','4'),
('Car Wash, автомойка','Семёнов Е. В., ИП','местная','3606','2524.19','-27367.84',NULL,NULL,NULL,NULL,'Орлова Ольга Александровна','2021-02-01','2022-01-31','12'),
('Dinonna, служба доставки пиццы и суши','Серышев П. В., ИП','местная','3918','3526.2',NULL,NULL,NULL,NULL,NULL,'Орлова Ольга Александровна','2020-03-01','2021-02-28','12'),
('ECHO, торгово-сервисный центр','Скородумов С.В., ИП','местная','3546','2672.99',NULL,NULL,NULL,NULL,NULL,'Орлова Ольга Александровна','2020-10-01','2021-09-30','12'),
('EUROREPAR CAR SERVICE','Гуляев Р. Ю., ИП','местная','5298','2916.66',NULL,NULL,NULL,NULL,NULL,'Степанова Анастасия Сергеевна','2020-07-01','2021-06-30','12'),
('Garage, автосервис, ООО Автофарм','АВТОФАРМ, ООО','местная','2112','2112','-2218',NULL,NULL,'2112','2021-02-09','Орлова Ольга Александровна','2020-03-01','2021-02-28','12'),
('Gourmetto, городское кафе','РМК, ООО','местная','3294','2799.9','-5599.8',NULL,NULL,'5599.8','2021-02-12','Орлова Ольга Александровна','2021-01-01','2021-06-30','6'),
('Gourmetto, семейное кафе, ООО Рестораны Гурметто','Хуторок, ООО','местная','2670','2269.5',NULL,NULL,NULL,'5339','2021-02-15','Орлова Ольга Александровна','2021-01-01','2021-06-30','6'),
('Gourmetto, служба горячей доставки','Деливери, ООО','местная','4230','3384',NULL,NULL,NULL,NULL,NULL,'Орлова Ольга Александровна','2020-10-01','2021-03-31','6'),
('HURMA, ресторан-бар','ХУРМА, ООО','местная','4356','3967.66','0',NULL,NULL,'7935.33','2021-02-15','Орлова Ольга Александровна','2021-01-01','2021-06-30','6'),
('HYPE BEAUTY CLUB, салон красоты','Каргопольцева С. А.,ИП','местная','3108','2500','3108',NULL,NULL,NULL,NULL,'Степанова Анастасия Сергеевна','2021-01-01','2021-06-30','6'),
('Jazz & Blues Loft Bar','Концепт, ООО','местная','2670','2235',NULL,NULL,NULL,NULL,NULL,'Тараканова Анастасия Валерьевна','2020-10-01','2021-09-30','12'),
('London Express, лингвистическая школа','Антонюк Е. И., ИП','местная','3300','3300',NULL,NULL,NULL,NULL,NULL,'Степанова Анастасия Сергеевна','2020-11-01','2021-02-28','4'),
('Max-сервис, торгово-сервисный центр, ИП Пименов П. В.','Пименов П.В., ИП','местная','4980','4233',NULL,NULL,NULL,NULL,NULL,'Степанова Анастасия Сергеевна','2021-02-01','2021-05-31','4'),
('MOBSTORE, магазин мобильных аксессуаров','Михайлов И.Ю., ИП','местная','2670','1335',NULL,NULL,NULL,NULL,NULL,'Орлова Ольга Александровна','2020-03-01','2021-02-28','12'),
('MOBSTORE, магазин мобильных аксессуаров','Михайлов И.Ю., ИП','местная','630','630',NULL,NULL,NULL,NULL,NULL,'Орлова Ольга Александровна','2021-01-01','2021-12-31','12'),
('MODENLER, авторское ателье','Григорьева В. В., ИП','местная','3666','3108',NULL,NULL,NULL,NULL,NULL,'Степанова Анастасия Сергеевна','2020-11-01','2021-02-28','4'),
('MY KITCHEN, ресторан','Вкус лета, ООО','местная','3294','2799.9','-0.02',NULL,NULL,'5599.8','2021-02-15','Орлова Ольга Александровна','2021-01-01','2021-06-30','6'),
('NSP, торговая фирма','Ерченко Н. Д., ИП','местная','3300','3300',NULL,NULL,NULL,NULL,NULL,'Гунёва Ариана Алексеевна','2020-12-01','2021-03-31','4'),
('OldBoy, барбершоп','Демидова Г. В., ИП','местная','3858','3086.4',NULL,NULL,NULL,NULL,NULL,'Малинова Олеся Юрьевна','2020-12-01','2021-05-31','6'),
('PaintBox, автостудия','Топ Медиа, ООО','местная','4446','2445.3',NULL,NULL,NULL,NULL,NULL,'Малинова Олеся Юрьевна','2020-06-01','2021-05-31','12'),
('Park авто, автостоянка для грузовых и легковых автомобилей','Назарова Т. В., ИП','местная','2670','2499.98',NULL,NULL,NULL,NULL,NULL,'Степанова Анастасия Сергеевна','2021-01-01','2021-04-30','4'),
('PASHA STUDIO, студия красоты','Романов П. Н., ИП','местная','3546','3368.7','-3542.55',NULL,NULL,'3368.7','2021-02-10','Тараканова Анастасия Валерьевна','2020-11-01','2021-10-31','12'),
('Plaza, кафе','Люксор, ООО','местная','2670','1869','0',NULL,NULL,'11214','2021-02-01','Малинова Олеся Юрьевна','2020-09-01','2021-08-31','12'),
('PROFIservice, ИП Ефремов А.В.','Ефремов А. В., ИП','местная','5418','4500','0',NULL,NULL,'4500','2021-02-15','Орлова Ольга Александровна','2021-01-01','2021-12-31','12'),
('Romitto, фастфуд-кафе','ИП Сидорова Е. Н.','местная','4356','2831.4',NULL,NULL,NULL,NULL,NULL,'Степанова Анастасия Сергеевна','2020-12-01','2021-11-30','12'),
('S-Fitness, фитнес-клуб','Новый фитнес, ООО','местная','7773','7485',NULL,NULL,NULL,NULL,NULL,'Орлова Ольга Александровна','2021-02-01','2022-01-31','12'),
('Smart Service, сервис по ремонту мобильной техники','Цихоцкий М.М., ИП','местная','3918','2964.48',NULL,NULL,NULL,NULL,NULL,'Тараканова Анастасия Валерьевна','2020-11-01','2021-02-28','4'),
('Smart Сервис, ремонтная мастерская','Ярош М.А., ИП','местная','4800','3360',NULL,NULL,NULL,NULL,NULL,'Шелкова Татьяна Владиславовна','2020-04-01','2021-03-31','12'),
('Uni-BLOK, торгово-закупочная компания','Уни-Блок, ООО','расторжение','2982','2982',NULL,NULL,NULL,NULL,NULL,'Малинова Олеся Юрьевна','2021-02-01','2021-04-30','3'),
('VIANOR TRUCK, шиномонтажная мастерская','Респект, ООО','местная','3294','1976.4',NULL,NULL,NULL,NULL,NULL,'Орлова Ольга Александровна','2020-11-01','2021-10-31','12'),
('VN-AUTO, служба грузоперевозок и услуг строительной техники','Киселёва С.Т. (Группа компаний "Форс"), ИП','местная','2670','1869',NULL,NULL,NULL,NULL,NULL,'Орлова Ольга Александровна','2020-05-01','2021-04-30','12'),
('Volkhov Lounge cafe','Фудсервис, ООО','местная','3612','3250.8',NULL,NULL,NULL,NULL,NULL,'Тараканова Анастасия Валерьевна','2020-12-01','2021-03-31','4'),
('WebCare, автомойка','Скирда Д. А., ИП','местная','3294','2964.6',NULL,NULL,NULL,NULL,NULL,'Тараканова Анастасия Валерьевна','2021-01-01','2021-04-30','4'),
('Аварийно-Диспетчерская Служба, ООО','АДС, ООО','местная','3108','2175.6',NULL,NULL,NULL,NULL,NULL,'Орлова Ольга Александровна','2020-07-01','2021-06-30','12'),
('Автодок, магазин автозапчастей','Семёнов Е. В., ИП','местная','5106','4615.81','9554.2',NULL,NULL,NULL,NULL,'Орлова Ольга Александровна','2020-10-01','2021-06-30','8'),
('АвтоДок, СТО','Семёнов Вячеслав Вячеславович','местная','7914','5539.8',NULL,NULL,NULL,NULL,NULL,'Орлова Ольга Александровна','2020-11-01','2021-05-31','7'),
('АвтоКрай, автосервис','Топ Медиа, ООО','местная','7470','4108.5',NULL,NULL,NULL,NULL,NULL,'Степанова Анастасия Сергеевна','2020-06-01','2021-05-31','12'),
('Автомарка, сервисный центр','Марка, ООО','местная','5736','5000','-5823.69',NULL,NULL,'5000','2021-02-18','Орлова Ольга Александровна','2020-11-01','2021-10-31','12'),
('Автомойка №1','Семёнов Е. В., ИП','местная','3606','2524.19',NULL,NULL,NULL,NULL,NULL,'Орлова Ольга Александровна','2021-01-01','2021-08-31','8'),
('АВТОсистемы, автосервис','АВТОСИСТЕМЫ, ООО','местная','3486','2963.1',NULL,NULL,NULL,NULL,NULL,'Тараканова Анастасия Валерьевна','2020-09-01','2021-02-28','6'),
('АВТОСТЕКЛО, официальный представитель Bitstop','ИП Иванова И. А.','местная','3924','3335.4',NULL,NULL,NULL,NULL,NULL,'Тараканова Анастасия Валерьевна','2020-10-01','2021-03-31','6'),
('Автотон, мастерская по тонированию и ремонту стекол','Пушпор Д. Е.','местная','3108','2486.4',NULL,NULL,NULL,NULL,NULL,'Степанова Анастасия Сергеевна','2021-01-01','2021-04-30','4'),
('Автошкола, Дорожно-транспортный техникум','Дорожно-Транспортный Техникум, ОГА ПОУ','местная','2982','2385.6',NULL,NULL,NULL,NULL,NULL,'Тараканова Анастасия Валерьевна','2020-11-01','2021-10-31','12'),
('Аграрная Лесная Сельскохозяйственная Техника, ООО АЛСХТ-Сервис','АЛСХТ-Сервис, ООО','местная','4296','3364.2',NULL,NULL,NULL,NULL,NULL,'Малинова Олеся Юрьевна','2021-02-01','2021-07-31','6'),
('Аккумуляторная, компания по ремонту и зарядке аккумуляторов','Скобелев В. В., ИП','местная','2670','2403',NULL,NULL,NULL,NULL,NULL,'Степанова Анастасия Сергеевна','2020-10-01','2021-03-31','6'),
('Альфаком, интернет-провайдер','Альфаком, ООО','местная','3858','2700.6',NULL,NULL,NULL,NULL,NULL,'Шелкова Татьяна Владиславовна','2021-01-01','2021-12-31','12'),
('Амелия, сеть салонов цветов','Свиридов В.В., ИП','местная','3108','2797.2',NULL,NULL,NULL,NULL,NULL,'Степанова Анастасия Сергеевна','2020-12-01','2021-03-31','4'),
('Ангар 53, автосервис','ИП Пиваев И. Ю.','местная','4236','3812.4',NULL,NULL,NULL,NULL,NULL,'Тараканова Анастасия Валерьевна','2020-11-01','2021-02-28','4'),
('АНТЕЙ+, ООО, юридическая фирма','Траст, ООО','расторжение','3546','2482.19','-2482.2',NULL,NULL,NULL,NULL,'Тараканова Анастасия Валерьевна','2021-02-01','2021-07-31','6'),
('АТТ-сервис, автотехцентр','Атт-Сервис", ООО','местная','5484','4387.2',NULL,NULL,NULL,NULL,NULL,'Тараканова Анастасия Валерьевна','2020-12-01','2021-02-28','3'),
('Балтийская, металлобаза','БалтМеталл, ООО','местная','4470','3316.98',NULL,NULL,NULL,NULL,NULL,'Тараканова Анастасия Валерьевна','2020-09-01','2021-03-31','7'),
('Баттерфляй Медиа','БМР, ООО','местная','11148','11148',NULL,NULL,NULL,NULL,NULL,'Орлова Ольга Александровна','2021-02-01','2022-01-31','12'),
('Ближе к Телу, сеть магазинов','Васильева Л. Г., ИП','местная','4176','2714.4',NULL,NULL,NULL,NULL,NULL,'Тараканова Анастасия Валерьевна','2020-10-01','2021-09-30','12'),
('Большие суши и пицца','Селюгин Д.И., ИП','местная','5172','5172',NULL,NULL,NULL,NULL,NULL,'Тараканова Анастасия Валерьевна','2021-02-01','2021-05-31','4'),
('Важная дата, салон праздничного оформления','Волкова Н.В., ИП','местная','3300','2640',NULL,NULL,NULL,NULL,NULL,'Гунёва Ариана Алексеевна','2021-02-01','2021-06-30','5'),
('Ваш репетитор, ИП Андрианова Л.В.','Андрианова Л. В., ИП','местная','3660','2745','-2490',NULL,NULL,NULL,NULL,'Тараканова Анастасия Валерьевна','2021-01-01','2021-04-30','4'),
('Воданов, торгово-производственная компания','Кондакчян С.А., ИП','местная','2670','2670',NULL,NULL,NULL,NULL,NULL,'Орлова Ольга Александровна','2021-01-01','2021-12-31','12'),
('Вокруг Колеса, шинный центр','Шапочкин А. В., ИП','местная','4908','3435.6',NULL,NULL,NULL,NULL,NULL,'Тараканова Анастасия Валерьевна','2020-09-01','2021-08-31','12'),
('ВсеОкна.ру','МКС, ООО','местная','3294','2470.5',NULL,NULL,NULL,NULL,NULL,'Степанова Анастасия Сергеевна','2021-01-01','2021-06-30','6'),
('Выбор, медицинский центр планирования семьи, гинекологии и перинатологии','Выбор, ЗАО','местная','4422','4355.39','-4355.44',NULL,NULL,'4355.4','2021-02-04','Тараканова Анастасия Валерьевна','2020-11-01','2021-10-31','12'),
('ГазТерм, магазин','Газтерм, ООО','местная','3300','3300',NULL,NULL,NULL,NULL,NULL,'Степанова Анастасия Сергеевна','2020-11-01','2021-02-28','4'),
('География, ресторан','ХУРМА, ООО','местная','3924','2664.01',NULL,NULL,NULL,NULL,NULL,'Орлова Ольга Александровна','2021-01-01','2021-06-30','6'),
('ГеоНика, ООО','Геоника, ООО','местная','4980','3237',NULL,NULL,NULL,NULL,NULL,'Шелкова Татьяна Владиславовна','2020-07-01','2021-06-30','12'),
('ГеоСтрой, группа компаний','Жуколин О. А., ИП','местная','5052','5052','-1050',NULL,NULL,NULL,NULL,'Гунёва Ариана Алексеевна','2020-11-01','2021-02-28','3'),
('Гросс, ООО, торгово-сервисная компания','Гросс, ООО','местная','3984','2788.8',NULL,NULL,NULL,NULL,NULL,'Орлова Ольга Александровна','2020-10-01','2021-09-30','12'),
('Десять ноготков, магазин','Данилова С.Л., ИП','местная','4734','3077.1',NULL,NULL,NULL,NULL,NULL,'Шелкова Татьяна Владиславовна','2020-06-01','2021-05-31','12'),
('Джек-53, автошкола','Автошкола Джек-53, ООО','местная','2670','2556.75',NULL,NULL,NULL,NULL,NULL,'Орлова Ольга Александровна','2020-11-01','2021-06-30','8'),
('ЙОЙО ПИЦЦА, вкусная доставка','Векторпицца, ООО','местная','3294','1976.4','-4493.2',NULL,NULL,NULL,NULL,'Орлова Ольга Александровна','2020-11-01','2021-03-31','5'),
('Канцеляр, магазин товаров для офиса и школы','Комарова М.А., ИП','местная','4488','4314.59',NULL,NULL,NULL,NULL,NULL,'Тараканова Анастасия Валерьевна','2020-11-01','2021-04-30','6'),
('Карат Сервис, компания по производству и установке жалюзи, рулонных штор и потолков','Долотов М.Г., ИП','местная','3738','3108',NULL,NULL,NULL,NULL,NULL,'Шелкова Татьяна Владиславовна','2020-08-01','2021-07-31','12'),
('Квартал, агентство недвижимости','Тимофеев Д.Ю, ИП','местная','3294','2305.8',NULL,NULL,NULL,NULL,NULL,'Тараканова Анастасия Валерьевна','2020-07-01','2021-06-30','12'),
('Киммерия, центр компьютерной техники и расходных материалов','Киммерия, ООО','местная','3546','2797.2',NULL,NULL,NULL,NULL,NULL,'Степанова Анастасия Сергеевна','2020-11-01','2021-04-30','6'),
('КитАвто, автосервис','Пащенко Сергей Александрович, ИП','местная','4044','2830.8','-7184.2',NULL,NULL,NULL,NULL,'Орлова Ольга Александровна','2020-07-01','2021-06-30','12'),
('КитАвто, автосервис','Пащенко Сергей Александрович, ИП','местная','4482','3000',NULL,NULL,NULL,NULL,NULL,'Орлова Ольга Александровна','2020-11-01','2021-10-31','12'),
('Колмово, автомойка','Загурская О.В., ИП','местная','4362','3807.59','-3615.17',NULL,NULL,NULL,NULL,'Малинова Олеся Юрьевна','2020-11-01','2021-10-31','12'),
('Компьютеры, магазин, ООО ПК-Сервис','ПК-Сервис, ООО','местная','4422','3758.69',NULL,NULL,NULL,NULL,NULL,'Шелкова Татьяна Владиславовна','2020-10-01','2021-09-30','12'),
('Конкурент, компания натяжных потолков и жалюзи','Сабуров Ю. Е., ИП','местная','3108','3108',NULL,NULL,NULL,NULL,NULL,'Степанова Анастасия Сергеевна','2020-12-01','2021-03-31','4'),
('Кухни Инверно, производственная компания','Вега, ООО','местная','3546','2482.19',NULL,NULL,NULL,NULL,NULL,'Тараканова Анастасия Валерьевна','2020-12-01','2021-11-30','12'),
('Легион Шин','Легион Шин, ООО','местная','4920','4428',NULL,NULL,NULL,NULL,NULL,'Тараканова Анастасия Валерьевна','2020-10-01','2021-03-31','6'),
('ЛЕОН, центр кузовного ремонта','Кузнецов В. Г.','местная','3732','2687.04',NULL,NULL,NULL,NULL,NULL,'Малинова Олеся Юрьевна','2020-11-01','2021-03-31','5'),
('Магазин диванов','Ивановский И. В., ИП','местная','6414','5131.2',NULL,NULL,NULL,NULL,NULL,'Шелкова Татьяна Владиславовна','2020-04-01','2021-03-31','12'),
('Максим Академи, центр иностранных языков','Максим Академи, ЧУ ДО','местная','3300','2310',NULL,NULL,NULL,NULL,NULL,'Орлова Ольга Александровна','2020-10-01','2021-09-30','12'),
('МастерКомп-ВН, сервисный центр, ИП Рамазанов Д.С.','Рамазанов Д. С., ИП','местная','2670','2269.5',NULL,NULL,NULL,NULL,NULL,'Тараканова Анастасия Валерьевна','2020-11-01','2021-04-30','6'),
('Медведева берлога, пространство для праздников, мероприятий и событий','Иванов М.Ю., ИП','местная','6735','5051.25',NULL,NULL,NULL,NULL,NULL,'Шелкова Татьяна Владиславовна','2021-01-01','2021-06-30','6'),
('Медведица, магазин сувениров','Селичева Н.В., ИП','местная','2670','1869',NULL,NULL,NULL,NULL,NULL,'Малинова Олеся Юрьевна','2020-11-01','2021-10-31','12'),
('Медико-Биологический Центр, ООО','МБЦ, ООО','местная','3108','2175.6',NULL,NULL,NULL,NULL,NULL,'Орлова Ольга Александровна','2020-10-01','2021-09-30','12'),
('Медтехника, АО, сеть магазинов','Медтехника, АО','местная','2670','1602',NULL,NULL,NULL,NULL,NULL,'Степанова Анастасия Сергеевна','2021-02-01','2022-01-31','12'),
('Механика-ВН, ООО, компания по ремонту двигателей','Механика-ВН, ООО','местная','8427','7096.5','-6433.87',NULL,NULL,'7096.5','2021-02-02','Шелкова Татьяна Владиславовна','2020-11-01','2021-07-31','9'),
('Минерал, ООО, компания по маркшейдерскому обслуживанию','Минерал, ООО','местная','3660','1830',NULL,NULL,NULL,NULL,NULL,'Тараканова Анастасия Валерьевна','2020-09-01','2021-02-28','6'),
('Мир удивительных товаров, магазин','Матросов О.Ю., ИП','местная','3546','3191.4',NULL,NULL,NULL,NULL,NULL,'Малинова Олеся Юрьевна','2020-10-01','2021-03-31','6'),
('Мне б вчера, рекламное агентство полного цикла','Иванов М.Ю., ИП','местная','4734','3313.8',NULL,NULL,NULL,NULL,NULL,'Шелкова Татьяна Владиславовна','2020-12-01','2021-11-30','12'),
('Мобилком, сервисный центр по ремонту телефонов и компьютеров','Самойлова А. Л., ИП','местная','6672','5671.2',NULL,NULL,NULL,NULL,NULL,'Степанова Анастасия Сергеевна','2020-11-01','2021-02-28','4'),
('Мойдодыр, ООО','Мойдодыр, ООО','местная','3570','3570',NULL,NULL,NULL,NULL,NULL,'Орлова Ольга Александровна','2020-05-01','2021-04-30','12'),
('Надежные двери, магазин','Кузнецов К. Л., ИП','местная','3108','2797.2','5608.4',NULL,NULL,NULL,NULL,'Малинова Олеся Юрьевна','2020-12-01','2021-05-31','6'),
('Новбат-53, ООО Новбат','Новбат, ООО','местная','4986','4171.68',NULL,NULL,NULL,NULL,NULL,'Орлова Ольга Александровна','2021-02-01','2021-07-31','6'),
('Новгород телеком, АО','Новгород Телеком, АО','местная','3300','2640',NULL,NULL,NULL,NULL,NULL,'Шелкова Татьяна Владиславовна','2020-11-01','2021-03-31','5'),
('Новгородский центр пожарной безопасности, ООО','НЦПБ+, ООО','местная','5010','2505',NULL,NULL,NULL,NULL,NULL,'Орлова Ольга Александровна','2020-03-01','2021-02-28','12'),
('Новтехлес, торговый центр садово-парковой техники','Новтехлес, ООО ПКФ','местная','3300','3129',NULL,NULL,NULL,NULL,NULL,'Тараканова Анастасия Валерьевна','2020-10-01','2021-09-30','12'),
('НовТехника, магазин','Глушаков Д. И., ИП','местная','6852','3426',NULL,NULL,NULL,NULL,NULL,'Малинова Олеся Юрьевна','2020-03-01','2021-02-28','12'),
('Новый Дом, торговый центр','Жоваников В. Н., ИП','местная','4422','3979.8',NULL,NULL,NULL,NULL,NULL,'Степанова Анастасия Сергеевна','2020-12-01','2021-03-31','4'),
('Новый стандарт 32, семейная клиника','Новый Стандарт 32, ООО','местная','4986','4417.2',NULL,NULL,NULL,NULL,NULL,'Тараканова Анастасия Валерьевна','2020-10-01','2021-03-31','6'),
('Носорог, компания по производству аксессуаров для стрелкового оружия','Дучко И. П., ИП','местная','4566','4165.2',NULL,NULL,NULL,NULL,NULL,'Малинова Олеся Юрьевна','2020-09-01','2021-02-28','3'),
('Облака, магазин постельного белья','Парфенова О.Ю., ИП','местная','3738','2544','-43500',NULL,NULL,NULL,NULL,'Шелкова Татьяна Владиславовна','2020-04-01','2021-03-31','10'),
('Облака, магазин постельного белья','Парфенова О.Ю., ИП','местная','2010','1608',NULL,NULL,NULL,NULL,NULL,'Шелкова Татьяна Владиславовна','2020-10-01','2021-09-30','12'),
('ОКНА ВН, ремонтно-монтажная компания','Павлив В., ИП','местная','4050','3078',NULL,NULL,NULL,NULL,NULL,'Степанова Анастасия Сергеевна','2020-11-01','2021-02-28','4'),
('Окна Европы, торговая фирма','ИП Васильева Т. А.','местная','4782','3347.4',NULL,NULL,NULL,NULL,NULL,'Малинова Олеся Юрьевна','2020-03-01','2021-02-28','12'),
('Окна Лидер','Окна Лидер, ООО','местная','2670','2269.5',NULL,NULL,NULL,NULL,NULL,'Тараканова Анастасия Валерьевна','2021-02-01','2021-07-31','6'),
('Папирус, пункт приема макулатуры','Папирус, ООО','местная','3300','2670',NULL,NULL,NULL,NULL,NULL,'Тараканова Анастасия Валерьевна','2020-11-01','2021-10-31','12'),
('Парис, сеть автостоянок','Парис, ООО','местная','2670','2403',NULL,NULL,NULL,NULL,NULL,'Тараканова Анастасия Валерьевна','2021-01-01','2021-04-30','4'),
('Планета 12 вольт, СТО','Малышев А. В., ИП','местная','4482','4000','-4000',NULL,NULL,'4000','2021-02-19','Орлова Ольга Александровна','2021-01-01','2021-12-31','12'),
('Плюмар, ООО, рекламно-производственная компания','ПК ПЛЮМАР, ООО','местная','3108','3108',NULL,NULL,NULL,NULL,NULL,'Степанова Анастасия Сергеевна','2020-11-01','2021-02-28','4'),
('Портниха, ателье-химчистка','Шитова Ж.Ю., ИП','местная','4230','2961','4750.2',NULL,NULL,NULL,NULL,'Шелкова Татьяна Владиславовна','2021-01-01','2021-12-31','11'),
('Потолок ВН53, компания по монтажу натяжных потолков','Кудрин М.В., ИП','местная','2670','2002.5',NULL,NULL,NULL,NULL,NULL,'Степанова Анастасия Сергеевна','2021-01-01','2021-04-30','4'),
('Прагматика ICE, автосервис для иномарок','Новгород-Лада, ООО','местная','10548','8904.45',NULL,NULL,NULL,NULL,NULL,'Шелкова Татьяна Владиславовна','2020-11-01','2021-02-28','4'),
('Президент, компания натяжных потолков и интерьерных лестниц','Потолки в Новгороде, ООО','местная','3108','2641.8',NULL,NULL,NULL,NULL,NULL,'Тараканова Анастасия Валерьевна','2020-11-01','2021-04-30','6'),
('Пряник, ресторан-бар','Дта Агро, ООО','местная','3606','2524.19',NULL,NULL,NULL,NULL,NULL,'Орлова Ольга Александровна','2020-12-01','2021-11-30','12'),
('ПСК ТеплоСистемы, ООО','ПСК Теплосистемы, ООО','местная','3300','2254.19','-2254.2',NULL,NULL,'27050','2021-02-01','Гунёва Ариана Алексеевна','2021-02-01','2022-01-31','12'),
('ПСКОВВТОРМЕТ, ОАО','Псковвтормет, ОАО','местная','3294','3294',NULL,NULL,NULL,NULL,NULL,'Гунёва Ариана Алексеевна','2021-02-01','2021-05-31','4'),
('Пульсар Авто, автосервис','Транслидер, ООО','местная','4668','3267.6','16338.02',NULL,NULL,NULL,NULL,'Тараканова Анастасия Валерьевна','2020-11-01','2021-10-31','12'),
('Рандеву, торговый дом','Артемьев В.В., ИП','местная','5784','2892',NULL,NULL,NULL,NULL,NULL,'Тараканова Анастасия Валерьевна','2020-03-01','2021-02-28','12'),
('Рахманинов, отель','Волхов УК, ООО','местная','3612','3612',NULL,NULL,NULL,NULL,NULL,'Орлова Ольга Александровна','2020-12-01','2021-11-30','12'),
('РЕМОНТ ЭЛЕКТРОДВИГАТЕЛЕЙ, ООО, компания','Ремонт Электродвигателей, ООО','местная','4942.5','3459.75',NULL,NULL,NULL,NULL,NULL,'Малинова Олеся Юрьевна','2020-07-01','2021-06-30','12'),
('РЕМОНТ ЭЛЕКТРОДВИГАТЕЛЕЙ, ООО, компания','Ремонт Электродвигателей, ООО','местная','3660','3660',NULL,NULL,NULL,NULL,NULL,'Малинова Олеся Юрьевна','2020-12-01','2021-02-28','3'),
('Рождественское яблоко, мастерская елочных игрушек','Мануфактуринг ОВК, ООО','местная','4218','2527.19',NULL,NULL,NULL,NULL,NULL,'Малинова Олеся Юрьевна','2021-01-01','2021-04-30','4'),
('Роза ветров, гостиница','РИПР, ГОАУДПО','служебный заказ','2670','2670',NULL,NULL,NULL,NULL,NULL,'Тараканова Анастасия Валерьевна','2021-02-01','2021-04-30','3'),
('Рубеж, оптово-розничная компания','Рубеж, ООО','местная','4446','3112.2',NULL,NULL,NULL,NULL,NULL,'Малинова Олеся Юрьевна','2020-08-01','2021-07-31','12'),
('Русский Мир, транспортно-туристическая фирма','Морозова М. А., ИП','местная','3300','2310',NULL,NULL,NULL,NULL,NULL,'Тараканова Анастасия Валерьевна','2020-10-01','2021-09-30','12'),
('С легким паром!, баня-сауна','Бобарыкин А. Н., ИП','местная','2670','1335',NULL,NULL,NULL,NULL,NULL,'Тараканова Анастасия Валерьевна','2020-03-01','2021-02-28','12'),
('Садко, гостиница','Гостиница Садко, ООО','местная','4908','2454',NULL,NULL,NULL,NULL,NULL,'Шелкова Татьяна Владиславовна','2020-03-01','2021-02-28','12'),
('Садко, ресторан','Ресторан Садко, ООО','местная','4470','2235',NULL,NULL,NULL,NULL,NULL,'Шелкова Татьяна Владиславовна','2020-03-01','2021-02-28','12'),
('Сан-Сэт Стройдизайн+, ООО, торговая компания','Сан-Сэт Строй-Дизайн+, ООО','местная','5346','4276.8',NULL,NULL,NULL,NULL,NULL,'Малинова Олеся Юрьевна','2020-08-01','2021-07-31','12'),
('Север телеком, АО','Север Телеком, АО','местная','5358','4822.2',NULL,NULL,NULL,NULL,NULL,'Шелкова Татьяна Владиславовна','2021-02-01','2021-04-30','3'),
('Секреты долголетия, медицинский центр','Секреты долголетия, ООО','местная','4422','2944.75',NULL,NULL,NULL,NULL,NULL,'Орлова Ольга Александровна','2020-09-01','2021-08-31','12'),
('Семейная оптика','Семейная оптика, ООО','местная','4482','4246.49','4249.5',NULL,NULL,'4246.5','2021-02-02','Тараканова Анастасия Валерьевна','2020-12-01','2021-11-30','12'),
('Сказка, чайхана','Сказка, ООО','местная','5970','3582',NULL,NULL,NULL,NULL,NULL,'Орлова Ольга Александровна','2020-08-01','2021-07-31','12'),
('Славянская Ярмарка, торговый центр','Славянская компания, ООО','местная','3300','2640',NULL,NULL,NULL,NULL,NULL,'Орлова Ольга Александровна','2020-12-01','2021-11-30','12'),
('Сокровища Хольмгарда, сувенирная лавка','Михеев А. С., ИП','местная','3858','2750.01',NULL,NULL,NULL,NULL,NULL,'Степанова Анастасия Сергеевна','2020-12-01','2021-11-30','12'),
('Соседи, агентство недвижимости','Надина Н.Л., ИП','местная','3732','2239.19',NULL,NULL,NULL,NULL,NULL,'Орлова Ольга Александровна','2020-09-01','2021-08-31','12'),
('Специалист, торговая компания','Спец+, ООО','местная','3984','3386.4',NULL,NULL,NULL,NULL,NULL,'Тараканова Анастасия Валерьевна','2020-12-01','2021-05-31','6'),
('Спорт-индустрия, спортивная школа по фигурному катанию, хоккею и шахматам','Спорт-Индустрия, Гоау Сш','местная','9525','8999.98',NULL,NULL,NULL,NULL,NULL,'Малинова Олеся Юрьевна','2020-09-01','2021-07-31','11'),
('СпортАктив, магазин спортивной одежды и обуви','Ильина Т.Ю., ИП','местная','3738','2616.6',NULL,NULL,NULL,NULL,NULL,'Тараканова Анастасия Валерьевна','2020-11-01','2021-10-31','12'),
('Столы и Стулья, магазин','НовЛерТорг, ООО','местная','3738','3738',NULL,NULL,NULL,NULL,NULL,'Гунёва Ариана Алексеевна','2021-02-01','2021-05-31','4'),
('СтройИндустрия, компания','Стройиндустрия, ООО','местная','4050','3250.66',NULL,NULL,NULL,NULL,NULL,'Малинова Олеся Юрьевна','2021-02-01','2021-07-31','6'),
('Суши Хауз, магазин','Кириллова И.Л., ИП','местная','3918','3918',NULL,NULL,NULL,NULL,NULL,'Орлова Ольга Александровна','2021-01-01','2021-12-31','12'),
('Тепло, траттория','РЕСТОРАНЫ ГУРМЕТТО, ООО','местная','3294','2799.9','0',NULL,NULL,'5599.8','2021-02-15','Орлова Ольга Александровна','2021-01-01','2021-06-30','6'),
('Тетрис, торгово-строительный центр','Тетрис, ТСЦ, ООО','местная','5052','4355.31','0.05',NULL,NULL,'26131.98','2021-02-18','Орлова Ольга Александровна','2021-02-01','2022-01-31','12'),
('ТК НОВГОРОДАВТОТУР','Яковлев С. А., ИП','местная','2670','1713.25','-13706',NULL,NULL,NULL,NULL,'Орлова Ольга Александровна','2020-07-01','2021-06-30','12'),
('Тракторные запчасти, магазин','Протон-Вн, ООО','местная','7644','5650.79','-11606.4',NULL,NULL,NULL,NULL,'Шелкова Татьяна Владиславовна','2020-09-01','2021-07-31','9'),
('Транспортная компания, ИП Ильина Н.М.','Ильина Н.М.,ИП','местная','4446','3112.2','-3111.6',NULL,NULL,NULL,NULL,'Орлова Ольга Александровна','2020-06-01','2021-05-31','12'),
('Три кота','Баишева Р.А., ИП','местная','2670','2500','-2500.01',NULL,NULL,'5000','2021-02-08','Орлова Ольга Александровна','2021-02-01','2021-03-31','2'),
('У СНАЙПЕРА, сеть автомоек','Димартил, ООО','местная','3612','3250.8',NULL,NULL,NULL,NULL,NULL,'Малинова Олеся Юрьевна','2020-11-01','2021-04-30','6'),
('Универсал, сервис-центр','Топоров М.А., ИП','местная','4908','4200','-0.08',NULL,NULL,'4200','2021-02-09','Тараканова Анастасия Валерьевна','2020-07-01','2021-06-30','12'),
('УСПЕХ, компания дезинфекционных услуг','Успех, ООО','местная','3300','2805',NULL,NULL,NULL,NULL,NULL,'Тараканова Анастасия Валерьевна','2020-09-01','2021-02-28','6'),
('ФАРГО, барбершоп','Щеглов А. С., ИП','местная','3228','2259.6',NULL,NULL,NULL,NULL,NULL,'Малинова Олеся Юрьевна','2020-12-01','2021-11-30','12'),
('Фейерверки, магазин пиротехники','Григорьева Ю. А., ИП','местная','3300','1869',NULL,NULL,NULL,NULL,NULL,'Орлова Ольга Александровна','2020-12-01','2021-11-30','12'),
('Фея, свадебный салон','Максимова А. В., ИП','местная','3738','2990.4','8971.2',NULL,NULL,NULL,NULL,'Тараканова Анастасия Валерьевна','2021-02-01','2022-01-31','12'),
('Фокстрот, магазин мебели','Салин Э.В., ИП','местная','4422','3537.6',NULL,NULL,NULL,NULL,NULL,'Степанова Анастасия Сергеевна','2021-01-01','2021-06-30','6'),
('Формат-Кедр, магазин мебельных фасадов','Гринева М. А., ИП','местная','3546','1950.3',NULL,NULL,NULL,NULL,NULL,'Орлова Ольга Александровна','2020-11-01','2021-10-31','12'),
('Форум, выставочный зал','Форум, ООО','местная','3300','2805',NULL,NULL,NULL,NULL,NULL,'Гунёва Ариана Алексеевна','2021-02-01','2021-05-31','4'),
('Фото за 5 минут','ИП Ляхова Т. В.','местная','3738','3177.3',NULL,NULL,NULL,NULL,NULL,'Тараканова Анастасия Валерьевна','2020-10-01','2021-03-31','6'),
('Центр противопожарных услуг, многопрофильная компания','Семыкин Д.А., ИП','местная','4422','2661',NULL,NULL,NULL,NULL,NULL,'Малинова Олеся Юрьевна','2020-11-01','2021-10-31','12'),
('Четыре такта, магазин','Энергия, ООО','местная','4908','3190.2',NULL,NULL,NULL,NULL,NULL,'Тараканова Анастасия Валерьевна','2020-07-01','2021-06-30','12'),
('ЭКСПЕРТ, агентство недвижимости','Таранкова А. И., ИП','местная','5718','3716.7',NULL,NULL,NULL,NULL,NULL,'Малинова Олеся Юрьевна','2020-09-01','2021-08-31','12'),
('Ю-Имидж, ООО, геодезическая компания','Ю-Имидж, ООО','местная','2670','2670',NULL,NULL,NULL,NULL,NULL,'Степанова Анастасия Сергеевна','2020-12-01','2021-03-31','4'),
('Ювелирная мастерская','Ниязов Т. А., ИП','местная','2670','1869',NULL,NULL,NULL,NULL,NULL,'Тараканова Анастасия Валерьевна','2021-01-01','2021-06-30','6'),
('Юма, торгово-производственная компания','Попов М. Н., ИП','местная','3300','2970','3030',NULL,NULL,NULL,NULL,'Малинова Олеся Юрьевна','2021-02-01','2021-07-31','6'),
('Юрьевское подворье, бутик-отель','Подворье, ООО','местная','4050','3442.5',NULL,NULL,NULL,NULL,NULL,'Тараканова Анастасия Валерьевна','2020-12-01','2021-03-31','4');
*/






























}
