package com.example.designpatterns.behavioral.iterator

class JavaDeveloper(var name: String, var skills: Array<String>): Collection {
    override fun getIterator(): Iterator {
        return SkillIterator()
    }

    private inner class SkillIterator: Iterator{
        var index = 0
        override fun hasNext(): Boolean {
            return index < skills.size
        }

        override fun next(): Any {
            return skills[index++]
        }
    }
}