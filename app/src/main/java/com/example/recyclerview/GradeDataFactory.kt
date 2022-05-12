package com.example.recyclerview

import android.content.res.Resources

object GradeDataFactory {

    fun getParents(resources: Resources): MutableList<RecyclerViewItem> {
        val grades = mutableListOf<RecyclerViewItem>()

        val jS: List<RecyclerViewItem.Desc> = listOf(
            RecyclerViewItem.Desc("Базовый синтаксис Java и Kotlin"),
            RecyclerViewItem.Desc("Самостоятельный поиск информации"),
            RecyclerViewItem.Desc("Структура Android проекта"),
            RecyclerViewItem.Desc("Базовые компоненты Android приложения"),
            RecyclerViewItem.Desc("Основные виды View"),
            RecyclerViewItem.Desc("Клиент-серверное взаимодействие"),
            RecyclerViewItem.Desc("Работа с Git")

        )
        grades.add(
            RecyclerViewItem.Title(
                "Junior Start",
                resources.getDrawable(R.drawable.junior_start),
                false,
                jS
            )
        )

        val jF: List<RecyclerViewItem.Desc> = listOf(
            RecyclerViewItem.Desc("Основы gradle"),
            RecyclerViewItem.Desc("Принципы ООП"),
            RecyclerViewItem.Desc("Паттерны проектирования"),
            RecyclerViewItem.Desc("JUnit тесты"),
            RecyclerViewItem.Desc("JVM. Структура памяти"),
            RecyclerViewItem.Desc("Основные структуры данных в Java"),
            RecyclerViewItem.Desc("Утечки памяти"),
            RecyclerViewItem.Desc("RecycleView"),
            RecyclerViewItem.Desc("Многопоточность в Java и Android. Проблема гонки потоков"),
            RecyclerViewItem.Desc("Базовое знание SQL и Room"),
            RecyclerViewItem.Desc("Отладка приложений"),
            RecyclerViewItem.Desc("Операции над фрагментами"),
            RecyclerViewItem.Desc("Умеет задавать вопросы")

        )

        grades.add(
            RecyclerViewItem.Title(
                "Junior Full",
                resources.getDrawable(R.drawable.junior_full),
                false,
                jF
            )
        )

        val mS: List<RecyclerViewItem.Desc> = listOf(
            RecyclerViewItem.Desc("Custom View"),
            RecyclerViewItem.Desc("Нотификации"),
            RecyclerViewItem.Desc("Теория баз данных. Проектирование БД"),
            RecyclerViewItem.Desc("UX и Material Design гайдлайны"),
            RecyclerViewItem.Desc("Обфускация приложения, работа с Proguard"),
            RecyclerViewItem.Desc("Работа с Android сервисами"),
            RecyclerViewItem.Desc("REST API"),
            RecyclerViewItem.Desc("Системы счисления, битовые операции, кодировки"),
            RecyclerViewItem.Desc("Основы методологии скрам/ажаль. Умение самостоятельно оценивать задачи"),
            RecyclerViewItem.Desc("Обработка инпутов"),
            RecyclerViewItem.Desc("CoordinatorLayout и NestedScroll"),
            RecyclerViewItem.Desc("Работа с датой и временем")

        )
        grades.add(
            RecyclerViewItem.Title(
                "Middle Start",
                resources.getDrawable(R.drawable.middle_start),
                false,
                mS
            )
        )

        val mP: List<RecyclerViewItem.Desc> = listOf(
            RecyclerViewItem.Desc("Принципы SOLID"),
            RecyclerViewItem.Desc("Распространенные архитектурные решения в Android"),
            RecyclerViewItem.Desc("Уверенное понимание многомодульной структуры Android проекта"),
            RecyclerViewItem.Desc("Процесс рендера в Android OS"),
            RecyclerViewItem.Desc("Анимации в Android"),
            RecyclerViewItem.Desc("Схема работы Push уведомлений"),
            RecyclerViewItem.Desc("Профайлинг"),
            RecyclerViewItem.Desc("Отложенное выполнение задач в Android приложениях"),
            RecyclerViewItem.Desc("WindowManager и устройство работы диалогов"),
            RecyclerViewItem.Desc("Понятный код"),
            RecyclerViewItem.Desc("Навыки ревью")

        )

        grades.add(
            RecyclerViewItem.Title(
                "Middle Progressive",
                resources.getDrawable(R.drawable.middle_progressive),
                false,
                mP
            )
        )

        val mF: List<RecyclerViewItem.Desc> = listOf(
            RecyclerViewItem.Desc("Обеспечение безопасности данных, SSL"),
            RecyclerViewItem.Desc("UDP, TCP/IP, HTTP. WebSockets"),
            RecyclerViewItem.Desc("Concurrency"),
            RecyclerViewItem.Desc("JNI, C++"),
            RecyclerViewItem.Desc("Основы компьютерной графики"),
            RecyclerViewItem.Desc("Дно RecyclerView"),
            RecyclerViewItem.Desc("Основы Web разработки"),
            RecyclerViewItem.Desc("ContentProvider"),
            RecyclerViewItem.Desc("Метапрограммирование"),
            RecyclerViewItem.Desc("Gradle build system"),
            RecyclerViewItem.Desc("CI/CD")

        )

        grades.add(
            RecyclerViewItem.Title(
                "Middle Full",
                resources.getDrawable(R.drawable.middle_full),
                false,
                mF
            )
        )

        val s: List<RecyclerViewItem.Desc> = listOf(
            RecyclerViewItem.Desc("Ему можно доверить любую технически сложную задачу"),
            RecyclerViewItem.Desc("Следит за техническим \"здоровьем\" проектов команды"),
            RecyclerViewItem.Desc("Поддержка и развитие архитектуры проекта. Помогает тимлиду вести бэклог"),
            RecyclerViewItem.Desc("Проводит техническое ревью продуктовых требований"),
            RecyclerViewItem.Desc("Следит за обновлением технологий, доносит их до команды"),
            RecyclerViewItem.Desc("Хорошая математическая база"),
            RecyclerViewItem.Desc("Транслирует и оберегает \"продуктовое\" отношение к разработке. Следит, чтобы решения были обоснованы, а результат измерим"),
            RecyclerViewItem.Desc("Помогает джуну/мидлу в решении проблемы"),
            RecyclerViewItem.Desc("Сам прекрасно понимает пути развития в техническом плане"),
            RecyclerViewItem.Desc("Имеет отличные софт скилы, помогает в усовершенствовании процессов скрама в команде"),
            RecyclerViewItem.Desc("Имеет углубленные знания к каких-нибудь областях, связанных с его деятельностью"),
            RecyclerViewItem.Desc("Отличное знание Android SDK. Знает много внутренних костылей.")

        )

        grades.add(
            RecyclerViewItem.Title(
                "Senior",
                resources.getDrawable(R.drawable.senior),
                false,
                s
            )
        )

        return grades
    }
}