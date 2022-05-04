package com.example.recyclerview

import android.content.res.Resources

object GradeDataFactory {

    fun getParents(resources: Resources): List<RecyclerViewItem> {
        val grades = mutableListOf<RecyclerViewItem>()

        grades.add(
            RecyclerViewItem.Title(
                "Junior Start",
                resources.getDrawable(R.drawable.junior_start)
            )
        )
        grades.add(
            RecyclerViewItem.Desc(
                "Базовый синтаксис Java и Kotlin"
            )
        )
        grades.add(
            RecyclerViewItem.Desc(
                "Самостоятельный поиск информации"
            )
        )
        grades.add(
            RecyclerViewItem.Desc(
                "Структура Android проекта",
            )
        )
        grades.add(
            RecyclerViewItem.Desc(
                "Базовые компоненты Android приложения",
            )
        )
        grades.add(
            RecyclerViewItem.Desc(
                "Основные виды View",
            )
        )
        grades.add(
            RecyclerViewItem.Desc(
                "Клиент-серверное взаимодействие",
            )
        )
        grades.add(
            RecyclerViewItem.Desc(
                "Работа с Git"
            )
        )

        grades.add(
            RecyclerViewItem.Title(
                "Junior Full",
                resources.getDrawable(R.drawable.junior_full)
            )
        )
        grades.add(
            RecyclerViewItem.Desc(

                "Основы gradle",
            )
        )
        grades.add(
            RecyclerViewItem.Desc(
                "Принципы ООП",
            )
        )
        grades.add(
            RecyclerViewItem.Desc(
                "Паттерны проектирования",
            )
        )
        grades.add(
            RecyclerViewItem.Desc(
                "JUnit тесты",
            )
        )
        grades.add(
            RecyclerViewItem.Desc(
                "JVM. Структура памяти",
            )
        )
        grades.add(
            RecyclerViewItem.Desc(
                "Основные структуры данных в Java",
            )
        )
        grades.add(
            RecyclerViewItem.Desc(
                "Утечки памяти",
            )
        )
        grades.add(
            RecyclerViewItem.Desc(
                "RecycleView",
            )
        )
        grades.add(
            RecyclerViewItem.Desc(
                "Многопоточность в Java и Android. Проблема гонки потоков",
            )
        )
        grades.add(
            RecyclerViewItem.Desc(
                "Базовое знание SQL и Room",
            )
        )
        grades.add(
            RecyclerViewItem.Desc(
                "Отладка приложений",
            )
        )
        grades.add(
            RecyclerViewItem.Desc(
                "Операции над фрагментами",
            )
        )
        grades.add(
            RecyclerViewItem.Desc(
                "Умеет задавать вопросы"
            )
        )

        grades.add(
            RecyclerViewItem.Title(
                "Middle Start",
                resources.getDrawable(R.drawable.middle_start)
            )
        )
        grades.add(
            RecyclerViewItem.Desc(
                "Custom View",
            )
        )
        grades.add(
            RecyclerViewItem.Desc(
                "Нотификации",
            )
        )
        grades.add(
            RecyclerViewItem.Desc(
                "Теория баз данных. Проектирование БД",
            )
        )
        grades.add(
            RecyclerViewItem.Desc(
                "UX и Material Design гайдлайны",
            )
        )
        grades.add(
            RecyclerViewItem.Desc(
                "Обфускация приложения, работа с Proguard",
            )
        )
        grades.add(
            RecyclerViewItem.Desc(
                "Работа с Android сервисами",
            )
        )
        grades.add(
            RecyclerViewItem.Desc(
                "REST API",
            )
        )
        grades.add(
            RecyclerViewItem.Desc(
                "Системы счисления, битовые операции, кодировки",
            )
        )
        grades.add(
            RecyclerViewItem.Desc(
                "Основы методологии скрам/ажаль. Умение самостоятельно оценивать задачи",
            )
        )
        grades.add(
            RecyclerViewItem.Desc(
                "Обработка инпутов",
            )
        )
        grades.add(
            RecyclerViewItem.Desc(
                "CoordinatorLayout и NestedScroll",
            )
        )
        grades.add(
            RecyclerViewItem.Desc(
                "Работа с датой и временем"
            )
        )

        grades.add(
            RecyclerViewItem.Title(
                "Middle Progressive",
                resources.getDrawable(R.drawable.middle_progressive)
            )
        )

        grades.add(
            RecyclerViewItem.Desc(
                "Принципы SOLID",
            )
        )
        grades.add(
            RecyclerViewItem.Desc(
                "Распространенные архитектурные решения в Android",
            )
        )
        grades.add(
            RecyclerViewItem.Desc(
                "Уверенное понимание многомодульной структуры Android проекта",
            )
        )
        grades.add(
            RecyclerViewItem.Desc(
                "Процесс рендера в Android OS",
            )
        )
        grades.add(
            RecyclerViewItem.Desc(
                "Анимации в Android",
            )
        )
        grades.add(
            RecyclerViewItem.Desc(
                "Схема работы Push уведомлений",
            )
        )
        grades.add(
            RecyclerViewItem.Desc(
                "Профайлинг",
            )
        )
        grades.add(
            RecyclerViewItem.Desc(
                "Отложенное выполнение задач в Android приложениях",
            )
        )
        grades.add(
            RecyclerViewItem.Desc(
                "WindowManager и устройство работы диалогов",
            )
        )
        grades.add(
            RecyclerViewItem.Desc(
                "Понятный код",
            )
        )
        grades.add(
            RecyclerViewItem.Desc(
                "Навыки ревью"
            )
        )


        grades.add(
            RecyclerViewItem.Title(
                "Middle Full",
                resources.getDrawable(R.drawable.middle_full)
            )
        )

        grades.add(
            RecyclerViewItem.Desc(
                "Обеспечение безопасности данных, SSL",
            )
        )
        grades.add(
            RecyclerViewItem.Desc(
                "UDP, TCP/IP, HTTP. WebSockets",
            )
        )
        grades.add(
            RecyclerViewItem.Desc(
                "Concurrency",
            )
        )
        grades.add(
            RecyclerViewItem.Desc(
                "JNI, C++",
            )
        )
        grades.add(
            RecyclerViewItem.Desc(
                "Основы компьютерной графики",
            )
        )
        grades.add(
            RecyclerViewItem.Desc(
                "Дно RecyclerView",
            )
        )
        grades.add(
            RecyclerViewItem.Desc(
                "Основы Web разработки",
            )
        )
        grades.add(
            RecyclerViewItem.Desc(
                "ContentProvider",
            )
        )
        grades.add(
            RecyclerViewItem.Desc(
                "Метапрограммирование",
            )
        )
        grades.add(
            RecyclerViewItem.Desc(
                "Gradle build system",
            )
        )
        grades.add(
            RecyclerViewItem.Desc(
                "CI/CD"
            )
        )

        grades.add(
            RecyclerViewItem.Title(
                "Senior",
                resources.getDrawable(R.drawable.senior)
            )
        )

        grades.add(
            RecyclerViewItem.Desc(
                "Ему можно доверить любую технически сложную задачу",
            )
        )
        grades.add(
            RecyclerViewItem.Desc(
                "Следит за техническим \"здоровьем\" проектов команды",
            )
        )
        grades.add(
            RecyclerViewItem.Desc(
                "Поддержка и развитие архитектуры проекта. Помогает тимлиду вести бэклог",
            )
        )
        grades.add(
            RecyclerViewItem.Desc(
                "Проводит техническое ревью продуктовых требований",
            )
        )
        grades.add(
            RecyclerViewItem.Desc(
                "Следит за обновлением технологий, доносит их до команды",
            )
        )
        grades.add(
            RecyclerViewItem.Desc(
                "Хорошая математическая база",
            )
        )
        grades.add(
            RecyclerViewItem.Desc(
                "Транслирует и оберегает \"продуктовое\" отношение к разработке. Следит, чтобы решения были обоснованы, а результат измерим",
            )
        )
        grades.add(
            RecyclerViewItem.Desc(
                "Помогает джуну/мидлу в решении проблемы",
            )
        )
        grades.add(
            RecyclerViewItem.Desc(
                "Сам прекрасно понимает пути развития в техническом плане",
            )
        )
        grades.add(
            RecyclerViewItem.Desc(
                "Имеет отличные софт скилы, помогает в усовершенствовании процессов скрама в команде",
            )
        )
        grades.add(
            RecyclerViewItem.Desc(
                "Имеет углубленные знания к каких-нибудь областях, связанных с его деятельностью",
            )
        )
        grades.add(
            RecyclerViewItem.Desc(
                "Отличное знание Android SDK. Знает много внутренних костылей."
            )
        )

        return grades
    }
}