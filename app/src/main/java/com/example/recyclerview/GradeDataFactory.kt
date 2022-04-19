package com.example.recyclerview

import android.content.res.Resources

object GradeDataFactory {

	fun getParents(resources: Resources): List<DataModel> {
		val grades = mutableListOf<DataModel>()

		grades.add(
			DataModel(
				listOf(
					"Базовый синтаксис Java и Kotlin",
					"Самостоятельный поиск информации",
					"Структура Android проекта",
					"Базовые компоненты Android приложения",
					"Основные виды View",
					"Клиент-серверное взаимодействие",
					"Работа с Git"
				),
				"Junior Start",
				resources.getDrawable(R.drawable.junior_start)
			)
		)

		grades.add(
			DataModel(
				listOf(
					"Основы gradle",
					"Принципы ООП",
					"Паттерны проектирования",
					"JUnit тесты",
					"JVM. Структура памяти",
					"Основные структуры данных в Java",
					"Утечки памяти",
					"RecycleView",
					"Многопоточность в Java и Android. Проблема гонки потоков",
					"Базовое знание SQL и Room",
					"Отладка приложений",
					"Операции над фрагментами",
					"Умеет задавать вопросы"
				), "Junior Full",
				resources.getDrawable(R.drawable.junior_full)
			)
		)

		grades.add(
			DataModel(
				listOf(
					"Custom View",
					"Нотификации",
					"Теория баз данных. Проектирование БД",
					"UX и Material Design гайдлайны",
					"Обфускация приложения, работа с Proguard",
					"Работа с Android сервисами",
					"REST API",
					"Системы счисления, битовые операции, кодировки",
					"Основы методологии скрам/ажаль. Умение самостоятельно оценивать задачи",
					"Обработка инпутов",
					"CoordinatorLayout и NestedScroll",
					"Работа с датой и временем"
				), "Middle Start",
				resources.getDrawable(R.drawable.middle_start)
			)
		)

		grades.add(
			DataModel(
				listOf(
					"Принципы SOLID",
					"Распространенные архитектурные решения в Android",
					"Уверенное понимание многомодульной структуры Android проекта",
					"Процесс рендера в Android OS",
					"Анимации в Android",
					"Схема работы Push уведомлений",
					"Профайлинг",
					"Отложенное выполнение задач в Android приложениях",
					"WindowManager и устройство работы диалогов",
					"Понятный код",
					"Навыки ревью"
				), "Middle Progressive",
				resources.getDrawable(R.drawable.middle_progressive)
			)
		)

		grades.add(
			DataModel(
				listOf(
					"Обеспечение безопасности данных, SSL",
					"UDP, TCP/IP, HTTP. WebSockets",
					"Concurrency",
					"JNI, C++",
					"Основы компьютерной графики",
					"Дно RecyclerView",
					"Основы Web разработки",
					"ContentProvider",
					"Метапрограммирование",
					"Gradle build system",
					"CI/CD"
				), "Middle Full",
				resources.getDrawable(R.drawable.middle_full)
			)
		)

		grades.add(
			DataModel(
				listOf(
					"Ему можно доверить любую технически сложную задачу",
					"Следит за техническим \"здоровьем\" проектов команды",
					"Поддержка и развитие архитектуры проекта. Помогает тимлиду вести бэклог",
					"Проводит техническое ревью продуктовых требований",
					"Следит за обновлением технологий, доносит их до команды",
					"Хорошая математическая база",
					"Транслирует и оберегает \"продуктовое\" отношение к разработке. Следит, чтобы решения были обоснованы, а результат измерим",
					"Помогает джуну/мидлу в решении проблемы",
					"Сам прекрасно понимает пути развития в техническом плане",
					"Имеет отличные софт скилы, помогает в усовершенствовании процессов скрама в команде",
					"Имеет углубленные знания к каких-нибудь областях, связанных с его деятельностью",
					"Отличное знание Android SDK. Знает много внутренних костылей."
				), "Senior",
				resources.getDrawable(R.drawable.senior)
			)
		)

		return grades
	}
}