class Node
    attr_accessor :data, :left, :right
  
    def initialize(data)
      @data = data
      @left = nil
      @right = nil
    end
  end
  
  def create_node(data)
    Node.new(data)
  end
  
  def insert_node(root, data)
    if root.nil?
      return create_node(data)
    end
  
    if data < root.data
      root.left = insert_node(root.left, data)
    elsif data > root.data
      root.right = insert_node(root.right, data)
    end
  
    root
  end
  
  def inorder(root)
    if root.nil?
      return
    end
  
    inorder(root.left)
    print "#{root.data} -> "
    inorder(root.right)
  end
  
  def preorder(root)
    if root.nil?
      return
    end
  
    print "#{root.data} -> "
    preorder(root.left)
    preorder(root.right)
  end
  
  def postorder(root)
    if root.nil?
      return
    end
  
    postorder(root.left)
    postorder(root.right)
    print "#{root.data} -> "
  end
  
  root = nil
  root = insert_node(root, 50)
  insert_node(root, 30)
  insert_node(root, 20)
  insert_node(root, 40)
  insert_node(root, 70)
  insert_node(root, 60)
  insert_node(root, 80)
  
  puts "Inorder traversal:"
  inorder(root)
  puts "\n"
  
  puts "Preorder traversal:"
  preorder(root)
  puts "\n"
  
  puts "Postorder traversal:"
  postorder(root)
  puts "\n"
  