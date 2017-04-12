package jsonviewtest

class ProjectController {

    def index() {

        def product1 = Product.findOrSaveByName("ABC")
        def product2 = Product.findOrSaveByName("DEF")
        def field = ProductField.findOrSaveByName('field')
        def metadata = ProductMetaData.findOrSaveByField(field)

        [projects: [[products: [product1, product2], metadata: metadata]]]

    }
}
