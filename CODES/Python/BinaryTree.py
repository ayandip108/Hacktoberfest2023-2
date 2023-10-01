class Node:
    def __init__(self, data):
        self.data = data
        self.left = None
        self.right = None

def create_node(data):
    return Node(data)

def insert_node(root, data):
    if root is None:
        return create_node(data)
    
    if data < root.data:
        root.left = insert_node(root.left, data)
    elif data > root.data:
        root.right = insert_node(root.right, data)
    
    return root

def inorder(root):
    if root is None:
        return
    inorder(root.left)
    print(root.data, end=" -> ")
    inorder(root.right)

def preorder(root):
    if root is None:
        return
    print(root.data, end=" -> ")
    preorder(root.left)
    preorder(root.right)

def postorder(root):
    if root is None:
        return
    postorder(root.left)
    postorder(root.right)
    print(root.data, end=" -> ")

if __name__ == "__main__":
    root = None
    root = insert_node(root, 50)
    insert_node(root, 30)
    insert_node(root, 20)
    insert_node(root, 40)
    insert_node(root, 70)
    insert_node(root, 60)
    insert_node(root, 80)

    print("Inorder traversal:")
    inorder(root)
    print("\n")

    print("Preorder traversal:")
    preorder(root)
    print("\n")

    print("Postorder traversal:")
    postorder(root)
    print("\n")
