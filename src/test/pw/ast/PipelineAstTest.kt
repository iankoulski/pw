package pw.ast

import org.junit.Assert.*
import org.junit.Test

@Test
fun basicParse() {
    val pl = pipeline("test-pipeline")  {
        stage("build") {
            job("build and test") {
                maven("testbed/SampleJavaService") {}
            }
        }
    }
    assertEquals("test-pipeline", pl.name)

    val stage = pl.stageByName("build")
    assertEquals("build", stage.name)

    val job = stage.jobByName("build and test")
    assertEquals("build and test", job.name)

}
